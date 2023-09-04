package TerceiraAula;

public class IntegerSet {
    private boolean[] set;

    public IntegerSet() {
        set = new boolean[101];
    }

    public IntegerSet union(IntegerSet otherSet) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i <= 100; i++) {
            result.set[i] = this.set[i] || otherSet.set[i];
        }
        return result;
    }

    public IntegerSet intersection(IntegerSet otherSet) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i <= 100; i++) {
            result.set[i] = this.set[i] && otherSet.set[i];
        }
        return result;
    }

    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        }
    }

    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        }
    }

    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i <= 100; i++) {
            if (set[i]) {
                sb.append(i).append(" ");
                isEmpty = false;
            }
        }
        if (isEmpty) {
            return "--";
        } else {
            return sb.toString();
        }
    }

    public boolean isEqualTo(IntegerSet otherSet) {
        for (int i = 0; i <= 100; i++) {
            if (this.set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }
}

