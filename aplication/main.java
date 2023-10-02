package aplication;
import entities.Gerente;
import java.util.ArrayList;
import java.util.List;

import entities.Equipe;
import entities.Funcionario;
import entities.Vendedor;


public class main {
    public static void main(String[] args) {
        List<Funcionario> list = new ArrayList<>(); 

        list.add(new Vendedor("Vendedor", 1000, 5, 30));
        list.add(new Gerente("Gerente", 2000, 10, null, 0));

        
       
    }
}
