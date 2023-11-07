package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto01 = new Computador("Ryzen 7", 6000);
        System.out.println(produto01.getNome());
        System.out.println(produto01.getValor());
        System.out.println(produto01.calcularImposto());
        System.out.println("----------------");


        Produto produto02 = new Tomate("Americano", 15);
        System.out.println(produto02.getNome());
        System.out.println(produto02.getValor());
        System.out.println(produto02.calcularImposto());

    }
}
