import java.util.*;
/** This program was written to analyze a string, and count how many times a targeted letter appeared in the data.
 * @author Disaiah Bennett
 * @version 1.0
 */
public class counting{

private static int total = 0;
private static String word = null;
private static char letter;

public static Scanner scanner = new Scanner(System.in);

public static int letterCount(String w){
    char array[] = w.toCharArray(); // Converting string to character array

    System.out.print("Enter the letter you would like to count: ");
    letter = scanner.next().charAt(0); //Convert string input to character

    System.out.println();
    for(int i = 0; i < array.length; i++){
        if(array[i] == letter){
            System.out.print("(" + array[i] + ")");
            total++; // Increment total, based upon the amount of times the letter occurred
        }
        else
            System.out.print(array[i]);
    }
    scanner.close();
    return total;
}

public static void main(String args[]){
    
    System.out.print("Enter in string: ");
    word = scanner.nextLine(); // Enter in the string for testing
    
    int count = letterCount(word); // Initialize counter for letter reoccurence
    System.out.printf("\nThe targeted letter: [%s] appeared %d times\n", letter, count);
    scanner.close();
    }
}
