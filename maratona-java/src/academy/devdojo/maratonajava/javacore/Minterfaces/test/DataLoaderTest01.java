package academy.devdojo.maratonajava.javacore.Minterfaces.test;

<<<<<<< HEAD
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
=======
>>>>>>> 08bd3dc (Aula 87 - Interfaces - Parte 01)
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
<<<<<<< HEAD

        System.out.println("#####");
        databaseLoader.remove();
        fileLoader.remove();

        System.out.println("#####");
        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        System.out.println("#####");
        DataLoader.retrieveMaxDataSize();
        databaseLoader.retrieveMaxDataSize();

=======
>>>>>>> 08bd3dc (Aula 87 - Interfaces - Parte 01)
    }

}
