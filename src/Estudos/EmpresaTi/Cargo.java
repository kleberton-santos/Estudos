package EmpresaTi;

public enum Cargo {
    DESENVOVEDOR(5000.00),
    ANALISTA_DE_SISTEMAS(4000.00),
    DEPARTAMENTO_PESSOAL(3000.00);

   private final double SALARIO_BRUTO;

    Cargo(double SALARIO_BRUTO) {
        this.SALARIO_BRUTO = SALARIO_BRUTO;
    }

    public double getSALARIO_BRUTO() {
        return SALARIO_BRUTO;
    }
}
