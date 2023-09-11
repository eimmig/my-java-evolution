package QuartaAula;

public class IntegerSetTest {

    public static void main(String[] args) {
        testUnion();
        testIntersection();
        testDeleteElement();
        testIsEqualTo();
    }

    public static void testUnion() {
        System.out.println("testUnion");

        IntegerSet conjunto1 = new IntegerSet();
        conjunto1.insertElement(1);
        conjunto1.insertElement(2);
        conjunto1.insertElement(3);

        IntegerSet conjunto2 = new IntegerSet();
        conjunto2.insertElement(1);
        conjunto2.insertElement(4);
        conjunto2.insertElement(5);

        IntegerSet resultado = conjunto1.union(conjunto2);

        System.out.println("Conjunto 1: " + conjunto1.toSetString());
        System.out.println("Conjunto 2: " + conjunto2.toSetString());
        System.out.println("Resultado: " + resultado.toSetString());
        System.out.println();
    }

    public static void testIntersection() {
        System.out.println("testIntersection");

        IntegerSet conjunto1 = new IntegerSet();
        conjunto1.insertElement(1);
        conjunto1.insertElement(2);
        conjunto1.insertElement(3);

        IntegerSet conjunto2 = new IntegerSet();
        conjunto2.insertElement(1);
        conjunto2.insertElement(4);
        conjunto2.insertElement(5);

        IntegerSet resultado = conjunto1.intersection(conjunto2);

        System.out.println("Conjunto 1: " + conjunto1.toSetString());
        System.out.println("Conjunto 2: " + conjunto2.toSetString());
        System.out.println("Resultado: " + resultado.toSetString());
        System.out.println();
    }

    public static void testDeleteElement() {
        System.out.println("testDeleteElement");

        IntegerSet conjunto = new IntegerSet();
        conjunto.insertElement(1);
        conjunto.insertElement(2);
        conjunto.insertElement(3);

        System.out.println("Conjunto antes de Excluir: " + conjunto.toSetString());
        conjunto.deleteElement(2);
        System.out.println("Conjunto depois de Excluir: " + conjunto.toSetString());
        System.out.println();
    }

    public static void testIsEqualTo() {
        System.out.println("testIsEqualTo");

        IntegerSet conjunto1 = new IntegerSet();
        conjunto1.insertElement(1);
        conjunto1.insertElement(2);
        conjunto1.insertElement(3);

        IntegerSet conjunto2 = new IntegerSet();
        conjunto2.insertElement(1);
        conjunto2.insertElement(2);
        conjunto2.insertElement(3);

        boolean saoIguais = conjunto1.isEqualTo(conjunto2);

        System.out.println("Conjunto 1: " + conjunto1.toSetString());
        System.out.println("Conjunto 2: " + conjunto2.toSetString());
        System.out.println("São Iguais: " + (saoIguais ? "Sim" : "Não"));
        System.out.println();
    }
}
