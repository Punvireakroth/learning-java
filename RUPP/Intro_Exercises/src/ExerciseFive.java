// Group 4 M3

public class ExerciseFive {

    public static void main(String[] args) {
        int n = 0;
        while (Math.pow(n, 3) < 11000) { // loop when value n^3 < 11000
            n += 2;
            System.out.print(n + " ");
        }
        System.out.print(
                "The largest even integer n is " + (n - 2) + "."
        );
    }
}