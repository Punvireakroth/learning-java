import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        // Instantiate object
        Scanner input = new Scanner(System.in);

        System.out.print("Type an Integer: ");

        int integer = input.nextInt();

        System.out.print("Type an flaot: ");

        float decimal = input.nextFloat();
        input.nextLine();

        System.out.print("Type an String: ");

        String text = input.nextLine();

        System.out.print("Type an char: ");

        char character = input.next().charAt(0);




        System.out.println("\nFloat entered = " + integer);
        System.out.println("Double entered = " + decimal);
        System.out.println("String entered = " + text);
        System.out.println("Char entered = " + character);

        input.close();
    }
}