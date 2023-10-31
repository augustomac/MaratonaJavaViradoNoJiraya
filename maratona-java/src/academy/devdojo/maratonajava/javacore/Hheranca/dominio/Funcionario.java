package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario2");
    }
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário : " + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de R$ " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
