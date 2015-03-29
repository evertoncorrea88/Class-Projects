
public class Task1 {

    public static void main(String[] args) {

        int[] intList = new int[10];

        try {
            for (int i = 0; i <= 10; i++) {
                intList[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

        for (int i : intList) {
            System.out.println(i);
        }
    }

}
