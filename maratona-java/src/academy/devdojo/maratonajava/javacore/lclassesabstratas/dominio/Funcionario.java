package academy.devdojo.maratonajava.javacore.lclassesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        bonusSalario();
    }

    public abstract void bonusSalario();
}
