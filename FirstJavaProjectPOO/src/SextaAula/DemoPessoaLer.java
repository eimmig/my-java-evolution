package SextaAula;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DemoPessoaLer {
    public static void main(String[] args) {

        File arquivo = new File("agenda.dat");

        try {
            FileInputStream fin = new FileInputStream(arquivo);
            ObjectInputStream oin = new ObjectInputStream(fin);

            Pessoa[] agendaArq = (Pessoa[]) oin.readObject();
            oin.close();
            fin.close();

            for (Pessoa p : agendaArq) {
                p.imprimirDados();
            }
        } catch (Exception ex) {
            System.err.println("Deu erro " + ex.toString());
        }
    }
}
