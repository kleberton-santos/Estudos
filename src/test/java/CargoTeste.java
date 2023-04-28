import EmpresaTi.Cargo;
import EmpresaTi.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.imageio.IIOException;

public class CargoTeste {

    @Test
    void cargoNaoExistente(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Funcionario kleber = new Funcionario("Kleber", Cargo.valueOf("ANALISTA_QA"));
        });
    }

}
