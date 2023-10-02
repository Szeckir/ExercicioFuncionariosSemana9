package aplication;
import entities.Gerente;
import entities.Equipe;
import entities.Funcionario;
import entities.Vendedor;


public class main {
    public static void main(String[] args) {
        Funcionario vendedor1 = new Vendedor("Vendedor", 1000, 5, 30);
        Funcionario gerente1 = new Gerente("Gerente", 2000, 10, null, 0);

        System.out.println(gerente1.getNome());
        System.out.println(vendedor1.getNome());

        System.out.println(vendedor1.calculaSalario());
        System.err.println(gerente1.calculaSalario());

        
       
    }
}
