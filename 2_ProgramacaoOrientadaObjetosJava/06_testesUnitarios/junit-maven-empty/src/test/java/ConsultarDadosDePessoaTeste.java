import org.example.BancoDeDados;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTeste {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(2000,1,1)));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("João", LocalDate.of(2000,1,1)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertNull(null);
    }

    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}
