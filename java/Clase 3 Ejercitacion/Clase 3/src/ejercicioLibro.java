
import java.util.Scanner;

public class ejercicioLibro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        var nombreLibro = entrada.nextLine();
        System.out.println("Digite el autor del libro: ");
        var autor = entrada.nextLine();
        System.out.println("El libro \""+nombreLibro+ "\" fue escrito por "+ autor);
    }
}
