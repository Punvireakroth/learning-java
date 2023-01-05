import java.util.Arrays;

public class ExerciseFive {

    public static void main(String[] args) {
        int locker = 456, player = 456, count = 0;
        boolean[] locked = new boolean[456];

        Arrays.fill(locked, false);

        for (int i = 1; i <= player; i++) {
            for (int j = i; j <= locker; j += i) {
                if (locked[j - 1] == false) {
                    locked[j - 1] = true;
                } else {
                    locked[j - 1] = false;
                }
            }
        }

        for (int i = 0; i < locked.length; i++) {
            if (locked[i] == true) {
                if (count % 10 == 0) {
                    System.out.println("");
                }
                System.out.print((i + 1) + " ");
                count++;
            }
        }
        System.out.print("\ntotal: " + count);
    }
}
