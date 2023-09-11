package SextaAula;

import java.io.*;

public class DemoPessoaGravar {
    public static void main (String[] args) throws IOException {
        Pessoa[] agenda = new Pessoa[2];
        agenda [0] = new Pessoa ("joao " , "123");
        agenda [1] = new Pessoa ("maria" , "456");

        try {
            File arquivo = new File("agenda.dat");
            FileOutputStream fout = new FileOutputStream (arquivo) ;
            ObjectOutputStream oos = new ObjectOutputStream (fout) ;

            oos.writeObject(agenda);
            oos.flush();
            fout.close();
        } catch (Exception ex) {
            System.out.println("Deu erro " + ex.toString());
        }
    }
}
