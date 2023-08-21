import java.util.Scanner;

public class Segundo {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = teclado.nextInt();
        double r = teclado.nextDouble();
        String s = teclado.nextLine();
        s = teclado.nextLine();
        System.out.println("Inteiro: " + i + ", real " + r);
        System.out.println("Frase: " + s);
    }
}
