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
    void verificaCamposNulos(){
        Funcionario diego = null;

        Assertions.assertNull(null, "Usuario não encontrado");
    }



}
