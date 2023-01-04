/*
* Exercise 3
* ITE M3
* Sort an array of string by its alphabetical order
* */

import java.util.Arrays;
class ExerciseThree {
    public static void main(String[] args) {
        String tmp; // Store temporary variable
        String[] countryName = {"Cambodia", "Thailand", "Singapore", "USA", "Germany", "Japan", "French"};
        for(int i=0; i < countryName.length; i++) {
            for(int j = i+1; j < countryName.length; j++) {
                if(countryName[i].compareTo(countryName[j]) > 0) { //(s1 > s2) return positive.
                    // Swap the element
                    tmp = countryName[i];
                    countryName[i] = countryName[j];
                    countryName[j] = tmp;
                }
            }
        }
        // Display output
        System.out.print(Arrays.toString(countryName));
    }
}