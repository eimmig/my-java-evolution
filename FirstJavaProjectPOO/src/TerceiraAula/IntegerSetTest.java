package TerceiraAula;

public class IntegerSetTest {

    public static void main(String[] args) {
        IntegerSet integer1 = new IntegerSet();
        IntegerSet integer2 = new IntegerSet();

        IntegerSet union = testUnion(integer1, integer2);
        union.toSetString();

    }

    public static IntegerSet testUnion(IntegerSet integer1, IntegerSet integer2) {
        return integer1.union(integer2);
    }

    public static void testIntersection() {

    }

    public static void testDeleteElement() {

    }

    public static void testToSetString() {

    }

    public static void testIsEqualTo() {

    }

}
