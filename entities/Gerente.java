package entities;
public class Gerente extends Funcionario{
    private String setor;  
    private double adicionalSalario;

    public Gerente(String nome, double salarioBase, double descontos, String setor, double adicionalSalario) {
        super(nome, salarioBase, descontos);
        this.setor = setor;
        this.adicionalSalario = adicionalSalario;
    }

    public double calculaSalario() {
        
    }

    public String geraDescricao() {

    }

    public double calculaImposto() {

    }

    
}
