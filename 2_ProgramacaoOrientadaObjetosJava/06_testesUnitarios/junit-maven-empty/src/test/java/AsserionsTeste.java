import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AsserionsTeste {

    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNull() {
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Bento", LocalDate.now());
        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {

        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor, outroValor);

    }

}
