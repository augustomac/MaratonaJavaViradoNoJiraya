package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

/*
* 0 - Bloco de inicialização estático da superclasse é executado quando JVM carregar a classe pai
* 1 - Bloco de inicialização estático da subclasse é executado quando JVM carregar a classe filha
* 2 - Alocado espaço em memória para o objeto da superclasse
* 3 - Cada atributo da superclasse é criado e inicializado com os valores default ou o que for passado
* 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
* 5 - Construto é executado da superclasse
* 6 - Alocado espaço em memória para o objeto da subclasse
* 7 - Cada atributo da subclasse é criado e inicializado com os valores default ou o que for passado
* 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
* 9 - Construto é executado da subclasse
*/

public class HerancaTest03 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Tsunade");

    }
}
