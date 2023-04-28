import EmpresaTi.Cargo;
import EmpresaTi.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuncionarioTeste {
    @Test
    void verificarUsuarioECargo(){
        // given
        Funcionario kleber = new Funcionario("Kleber", Cargo.DESENVOVEDOR);

        // when
        Assertions.assertEquals("Kleber", kleber.getNome());
        Assertions.assertEquals(Cargo.DESENVOVEDOR, kleber.getCargo());
    }

    @Test
    void verificaCamposNulosFuncionario(){
        Funcionario diego = null;

        Assertions.assertNull(null, "Usuario não encontrado");
    }

    @Test
    void verificaUsuarioFuncionarioCadastrado(){
        Funcionario danilo = new Funcionario("Danilo", Cargo.DESENVOVEDOR);
        Assertions.assertEquals("Danilo",danilo.getNome());
        Assertions.assertEquals(Cargo.DESENVOVEDOR,danilo.getCargo());
    }


}
