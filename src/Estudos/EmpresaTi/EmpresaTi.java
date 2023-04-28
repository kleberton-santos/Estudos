package EmpresaTi;

public class EmpresaTi {
    public static void main(String[] args) {
        FolhaDepagamento folha = new CalculoFolhaDePagamento();

        Funcionario funcionario1 = new Funcionario("Kleber",Cargo.DESENVOVEDOR);
        Funcionario funcionario2 = new Funcionario("Diego", Cargo.ANALISTA_DE_SISTEMAS);
        Funcionario funcionario3 = new Funcionario("Thiago", Cargo.DEPARTAMENTO_PESSOAL);

        folha.salarioLiquido(funcionario1, funcionario1.getCargo().getSALARIO_BRUTO());
        folha.salarioLiquido(funcionario2, funcionario2.getCargo().getSALARIO_BRUTO());
        folha.salarioLiquido(funcionario3, funcionario3.getCargo().getSALARIO_BRUTO());


    }
}
