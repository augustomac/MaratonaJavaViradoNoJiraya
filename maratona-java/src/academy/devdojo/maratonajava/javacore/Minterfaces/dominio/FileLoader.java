package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

<<<<<<< HEAD
public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }


    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
=======
public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo.");
>>>>>>> 08bd3dc (Aula 87 - Interfaces - Parte 01)
    }
}
