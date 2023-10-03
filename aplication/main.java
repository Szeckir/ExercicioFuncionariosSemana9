package aplication;
import entities.Gerente;
import java.util.ArrayList;
import java.util.List;
import entities.Equipe;
import entities.Funcionario;
import entities.Vendedor;


public class Main {
    public static void main(String[] args) {
        Funcionario vendedor1 = new Vendedor("Joao", 1200, 10, 10);
        Funcionario gerente1 = new Gerente("Thomaz", 1200, 10, null, 10);

        
        System.out.println(vendedor1.calculaSalario());
        System.out.println(gerente1.calculaSalario());

        System.out.println(vendedor1.calculaImposto());
        System.out.println(gerente1.calculaImposto());
    }
}
