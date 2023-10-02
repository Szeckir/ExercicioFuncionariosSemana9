package entities;

public class Funcionario {
    private String nome;
    protected double salarioBase;
    protected double descontos;
    
    public Funcionario(String nome, double salarioBase, double descontos) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.descontos = descontos;
    }

    public String getNome() {
        return nome;
    }

    public double calculaSalario() {
        return this.salarioBase - this.descontos;
    }


}
