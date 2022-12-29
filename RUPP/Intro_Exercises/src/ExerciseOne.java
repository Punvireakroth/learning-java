import java.util.Scanner;

class ExerciseOne {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        while(total <= 50) {
            System.out.print("Input an Integer: ");
            int number = input.nextInt();
            total += number;
        }
        System.out.println(total);
    }
}