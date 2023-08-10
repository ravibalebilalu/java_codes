/*Create a program that counts the frequency of each character in a given string. */
import java.util.Scanner;

public class character_counter {
    public static void main(String[] args) {
        //initialize scanner
        Scanner sc = new Scanner(System.in);
        
        //ask user to enter a sentence
        System.out.println("Enter a sentence....");
        String sent = sc.nextLine();

        //create an integer array to store frequencies.Since there are 128 ASCII characters, we can create an array of size 128 to represent all possible characters.
        int [] frequency = new int [128];
        
        //traverse the string
        for (int i = 0;i<sent.length();i++){
            //take each characters in string
            char c = sent.charAt(i);
            //check weather character is a letter or digit
            if(Character.isLetterOrDigit(c)){
                //increment the corresponding array element
                frequency[c]++;
            }
            
        }
        //print the characters and corresponding frequencies
         for (int i = 0 ;i < frequency.length;i++){
            //select the charcters which have frequency graterthan 0(or which are in givan string)
            if(frequency[i] > 0){
                
                System.out.println((char)i+ " --> "+frequency[i]);
            }
         }
    }
}
