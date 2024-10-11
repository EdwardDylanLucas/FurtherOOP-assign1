package lists;

public class EfficientIntArrayList implements IntList {
    int[] values;
    int len;
    static int initialCapacity = 1;

    public EfficientIntArrayList() {
        values = new int[initialCapacity];
        len = 0;
    }

    public boolean contains(int value) {
        for (int i = 0; i < len; i++) {
            if (values[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void append(int value) {
        // this is inefficient but leave as is for now (now it is efficient version)
        if (len == values.length) {
            int[] newValues = new int[len * 2];
            for (int i = 0; i < len; i++) {
                newValues[i] = values[i];
            }
            values = newValues;
        }
        values[len] = value;
        len++; // same as len = len + 1;
    }

    public int length() {
        return len;
    }

    public static void main(String[] args) {
        EfficientIntArrayList list = new EfficientIntArrayList();
        list.append(10);
        list.append(20);
        list.append(30);
        System.out.println(list.contains(20));
        System.out.println(list.contains(4));
        System.out.println(list.length());
    }
}
