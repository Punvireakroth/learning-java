// Group 4 M3

public class ExerciseFive {

    public static void main(String[] args) {
        int n = 1;
        if (n)
        while (Math.pow(n, 3) < 11000) { // loop when value n^3 < 11000
            n++; // update
        }

        if (n % 2 != 0) { // covert odd to even
            n -= 1;
        }

        System.out.print(
                "The largest even integer n is " + n + "."
        );
    }
}