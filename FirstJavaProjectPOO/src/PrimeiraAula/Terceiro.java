package PrimeiraAula;

import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Terceiro {
    public static void main (String[] args) {
        String texto;

        texto = showInputDialog("Entre com um numero");
        int num = Integer.parseInt(texto);

        showMessageDialog(null, num);
    }
}
