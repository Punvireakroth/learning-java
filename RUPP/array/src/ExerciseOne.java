import java.util.Arrays;
import java.util.Scanner;

class exerciseOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a sentence my dear friend: ");
        String userInput = input.nextLine();
        // Slice words in sentence into array
        String[] words = userInput.split(" ");
        // Loop through array of word

        int max = words[0].length();

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > max) {
                max = words[i].length();
            }
        }

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() == max) {
                System.out.println("The Longest word in this sentence is: " + words[i]);
            }
        }
    }
}