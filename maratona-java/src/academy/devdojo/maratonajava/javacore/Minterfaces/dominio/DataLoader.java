package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

//interface e meio que um contrato
//em interface por padrão todos os métodos são publicos e abstratos
public interface DataLoader {
<<<<<<< HEAD
    public static final int MAX_DATA_SIZE = 10;
    int MIN_DATA_SIZE = 0;

//    (public abstract) void load();
// como escrevi acima já é sob entendido que o método é public absstract, podendo ser chmado como abaixo
    void load();
    default void checkPermission(){
        System.out.println("Checando permissões.");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
=======
//    (public abstract) void load();
// como escrevi acima já é sob entendido que o método é public absstract, podendo ser chmado como abaixo
    void load();
>>>>>>> 08bd3dc (Aula 87 - Interfaces - Parte 01)

}
