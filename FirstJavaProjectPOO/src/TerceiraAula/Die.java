package TerceiraAula;

import java.util.Random;

public class Die {
    private int sideUp;

    public Die() {
    };

    public int getSideUp() {
        return this.sideUp;
    }

    public void roll() {
        Random number = new Random();
        this.sideUp = number.nextInt(6) + 1;
    }
}
