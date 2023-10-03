package aplication;
import entities.Gerente;
import java.util.ArrayList;
import java.util.List;
import entities.Equipe;
import entities.Funcionario;
import entities.Vendedor;


public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        Funcionario vendedor1 = new Vendedor("Joao", 1200, 10, 10);
        Funcionario gerente1 = new Gerente("Thomaz", 1200, 10, null, 10);

        
        System.out.println(vendedor1.calculaSalario());
        System.out.println(gerente1.calculaSalario());

        System.out.println(vendedor1.calculaImposto());
        System.out.println(gerente1.calculaImposto());
=======
        Funcionario v1 = new Vendedor("Joao", 1000, 100, 0);
        Funcionario g1 = new Gerente("Maria", 2000, 1000, null, 0);

        

>>>>>>> 24b5f88b549f0edab43d7542d9a26e602f9822ab
    }
}
