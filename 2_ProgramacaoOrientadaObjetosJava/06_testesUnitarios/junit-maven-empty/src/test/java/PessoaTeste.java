import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {

        Pessoa bento = new Pessoa("Bento", LocalDate.of(2018, 1,1));
        Assertions.assertEquals(5, bento.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Bento", LocalDate.of(2018, 1, 1));
        Assertions.assertFalse(pessoa.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDate.of(1950, 1, 1));
        Assertions.assertTrue(joao.ehMaiorDeIdade());
    }
}
