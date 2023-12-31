package academy.devdojo.maratonajava.javacore.lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente (String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void bonusSalario() {
        this.salario = this.salario * 1.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
