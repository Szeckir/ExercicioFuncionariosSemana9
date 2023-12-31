package entities;

public final class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, double salarioBase, double descontos, double comissao) {
        super(nome, salarioBase, descontos);
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        return (this.salarioBase - this.descontos) + this.comissao;
    }

    @Override
    public double calculaImposto() {
        if (this.calculaSalario() <= 500) {
            return 0;
        } else if (this.calculaSalario() <= 500 && this.calculaSalario() >=2000) {
            return 10;
        } else  {
            return 20;
        }
    }
}