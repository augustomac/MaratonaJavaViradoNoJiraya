package academy.devdojo.maratonajava.javacore.lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luffy", 10000);
        System.out.println(gerente);

    }

}
