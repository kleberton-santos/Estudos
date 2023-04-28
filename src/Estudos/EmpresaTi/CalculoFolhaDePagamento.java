package EmpresaTi;

public class CalculoFolhaDePagamento implements FolhaDepagamento{
    @Override
    public double calcularImposto(double SALARIO_BRUTO) {
        if (SALARIO_BRUTO <= 1903.98) {
          return 0;
        } else if (SALARIO_BRUTO <= 2826.65) {
            return SALARIO_BRUTO * 0.75 - 142.80;
        } else if (SALARIO_BRUTO <= 3751.05) {
            return SALARIO_BRUTO * 0.15 - 354.80;
        } else if (SALARIO_BRUTO <= 4664.68) {
            return SALARIO_BRUTO * 0.225 - 636.13;
        } else {
            return SALARIO_BRUTO * 0.275 - 969.36;
        }
    }

    @Override
    public void salarioLiquido(Funcionario funcionario, double SALARIO_BRUTO) {
        double impostoCalculado = calcularImposto(SALARIO_BRUTO);
        double salarioLiquido = SALARIO_BRUTO - impostoCalculado;

        System.out.println("Funcionario: " + funcionario.getNome());
        System.out.println("Salario Liquido: " + salarioLiquido);
    }
}
