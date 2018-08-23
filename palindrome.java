import java.util.*;
/** This program is written to analyze a string word, and determine if it is a palindrome.
 *  The string word is converted into a character array, along with each letter being lowercased.
 * @author Disaiah Bennett
 * @version 1.0
 */

public class palindrome{

    public static void checkPalindrome(String w){
        char array[] = w.toCharArray(); // Convert string to character array
        int front = 0, end = array.length - 1; // Declare front and end counter

        if(array.length % 2 == 0){ // If the palindrome string is even
            for(int i = 0; i < array.length; i++){
                array[front] = Character.toLowerCase(array[front]); // Convert front character to lowercase
                array[end] = Character.toLowerCase(array[end]); // Convert end character to lowercase

                if(!(array[front] >= 'a' && array[front] <= 'z')){++front;} // Check if the position is a symbol or whitespace, if so increment
                if(!(array[end] >= 'a' && array[end] <= 'z')){--end;} // Check if the position is a symbol or whitespace, if so decrement

                System.out.println("Front Position: " + front + " End Position: " + end);
                System.out.print("Front Character: " + array[front] + " | End Character: " + array[end]);

                if(array[front] == array[end]){ // If both pointer values are equal, print true and increment and decrement counters
                    System.out.println(" (Status: " + true + ")\n");
                    front++; end--;
                }

                else{ // If both pointer array[value] is not equal, print false and break out of the loop
                    System.out.println(" (Status: " + false + ")\n");
                    System.out.println("Palindrome Status: [" + false + "]\n");
                    break;
                }

                if(front > end){ // If the increasing pointer is greater than the decreasing pointer 
                    System.out.println("Palindrome Status: [" + true + "]\n");
                    break;
                }
            }
        }

        else{ // If the palindrome string is odd
            for(int i = 0; i < array.length; i++){
                array[front] = Character.toLowerCase(array[front]); // Converts front character to lowercase
                array[end] = Character.toLowerCase(array[end]); // Converts end character to lowercase

                if(!(array[front] >= 'a' && array[front] <= 'z')){++front;} // Check if the position is a symbol or whitespace, if so increment
                if(!(array[end] >= 'a' && array[end] <= 'z')){--end;} // Check if the position is a symbol or whitespace, if so decrement

                System.out.println("Front Position: " + front + " End Position: " + end);
                System.out.print("Front Character: " + array[front] + " | End Character: " + array[end]);

                if(array[front] == array[end]){ // If both pointer values are equal, print true and increment and decrement counters
                    System.out.println(" (Status: " + true + ")\n");
                    front++; end--;
                }

                else{ // If both pointer array[value] is not equal, print false and break out of the loop
                    System.out.println(" (Status: " + false + ")\n");
                    System.out.println("Palindrome Status: [" + false + "]\n");
                    break;
                }

                if(front >= end){
                    System.out.println("Palindrome Status: [" + true + "]\n");
                    break;
                }
           }
        }
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in string: ");

        checkPalindrome(scanner.nextLine());
        scanner.close();
    }
}