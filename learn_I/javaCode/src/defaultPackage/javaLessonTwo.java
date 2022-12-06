import java.util.Scanner;
public class javaLessonTwo
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Your favorite number: ");
        if(userInput.hasNextInt())
        {
            // Getting input
           int numberEntered = userInput.nextInt();
           System.out.println("You entered: " + numberEntered);

           // Add
           int numEnteredTime2 = numberEntered + numberEntered;
           System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTime2);

           // Minus
           int numEnteredMinus2 = numberEntered - 2;
           System.out.println(numberEntered + " - 2 = " + numEnteredMinus2);

            // TimeSelf
            int numEnteredTimeSelf = numberEntered * numberEntered;
            System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimeSelf);

            // modulo
            int numEnteredRemained = numberEntered % numberEntered;
            System.out.println(numberEntered + " % " + numberEntered + " = " + numEnteredRemained);
        } else {
            System.out.println("Enter an integer next time! ");
        }
    }
}