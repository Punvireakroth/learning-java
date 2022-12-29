// Team 4 M3 ITE

import java.util.Scanner;

class ExerciseTwo {
    public static void main(String[] args) {
        int number = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
        }while (number < 5); // while number less than five execute the above block
        System.out.println("The last number you entered was a " + number);

        input.close();
    }
}