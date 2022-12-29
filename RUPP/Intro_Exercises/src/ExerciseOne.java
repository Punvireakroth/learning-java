// team 4 M3

import java.util.Scanner;

class ExerciseOne {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        // add until sum value greater than or equal to 50
        while(total <= 50) {
            System.out.print("Input an Integer: ");
            int number = input.nextInt();
            total += number;
        }
        System.out.println(total);
    }
}