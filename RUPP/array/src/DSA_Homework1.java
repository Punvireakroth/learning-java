import java.util.Scanner;
class DSA_Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 20 elements of array
        double[] myArray = {1.9, 2.45, 5.67, 2.34, 1.44, 2.98, 23.45, 675.43, 234.56, 45.67, 78.98, 34.54, 32.4, 3.21, 3.45, 6.54, 34.5, 67.8, 34.5, 67.5};
        // print all elements in array
        System.out.println("All the elements in array are: ");
        for(double i : myArray) {
            System.out.print(i + " ");
        }
        // Take input index and show the value of that index
        System.out.print("\nWhich index you want to see from 1 - 20 ? ");
        int userIndex = input.nextInt();
        System.out.println("Index " + userIndex + " is " + myArray[userIndex - 1]);
    }
}