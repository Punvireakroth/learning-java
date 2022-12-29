// Team 4 M3

import java.util.Scanner;

public class ExerciseThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char answer = 'y';
        int userInput1, userInput2, userInput,  sum = 0;

        System.out.print("Enter a Number: "); // run once
        userInput1 = input.nextInt();

        System.out.print("Enter another Number: "); // run another one
        userInput2 = input.nextInt();
        sum = userInput1 + userInput2;

        do {

            System.out.print("y/n: ");
            // catch char and covert to lowercase
            answer = input.next().toLowerCase().charAt(0);
            if(answer == 'n'){
                break;
            }else {
                System.out.print("Input: ");
                userInput = input.nextInt();
                sum += userInput;
            }
        } while (answer == 'y'); // loop when answer == 'y'

        System.out.print("Total: " + sum); // display when loop break

        input.close();
    }
}