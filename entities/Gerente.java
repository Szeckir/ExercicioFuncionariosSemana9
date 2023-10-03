package entities;
public final class Gerente extends Funcionario{
    private String setor;  
    private double adicionalSalario;

    public Gerente(String nome, double salarioBase, double descontos, String setor, double adicionalSalario) {
        super(nome, salarioBase, descontos);
        this.setor = setor;
        this.adicionalSalario = adicionalSalario;
    }

    @Override
    public double calculaSalario() {
        return (this.salarioBase - this.descontos) + this.adicionalSalario;
    }

    public String geraDescricao() {
        return setor;
    }

    @Override
    public double calculaImposto() {
        return (this.salarioBase / 1.7);
    }

    
}
