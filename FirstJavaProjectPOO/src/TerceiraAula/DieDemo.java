package TerceiraAula;

public class DieDemo {

    public static void main (String[] args) {
        Die dado1 = new Die();
        Die dado2 = new Die();

        dado1.roll();
        dado2.roll();

        //utilizado StringBuilder pois é mais recomendado por conta dos helpers
        StringBuilder resposta = new StringBuilder();

        montaResposta(resposta, dado1, dado2);
    }

    public static void montaResposta (StringBuilder resposta, Die dado1, Die dado2) {
        resposta.append("Dado 1: ")
                .append(dado1.getSideUp())
                .append(" Dado 2: ")
                .append(dado2.getSideUp())
                .append(" Soma = ")
                .append((dado1.getSideUp() + dado2.getSideUp()));

        System.out.println(resposta);
    }
}
