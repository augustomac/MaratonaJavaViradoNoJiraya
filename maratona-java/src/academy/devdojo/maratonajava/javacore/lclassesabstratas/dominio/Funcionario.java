package academy.devdojo.maratonajava.javacore.lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        bonusSalario();
<<<<<<< HEAD
    }

    public abstract void bonusSalario();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
=======
>>>>>>> 10d9dff (Aula 85 - Classes Abstratas - 02)
    }

    public abstract void bonusSalario();
}
