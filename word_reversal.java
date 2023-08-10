/*Word Reversal: Write a program that takes 
a sentence as input and reverses the order 
of words. */
//import scanner
import java.util.Scanner;
public class word_reversal {
    //method for word reversal
    static String[] wordReversal(String x){
        //split the sentences for space(" ") and store splitted string in string array
        String [] splitted = x.split(" ", 0);
        //initialize a string array to store reversed strings
        String [] result = new String[splitted.length];
        //initiate counter to track forword index
        int count = 0;
        //iterate string array in reverse direction
        for (int i = splitted.length -1;i>-1;i--){
            //store the words in new array in reverse direction
            result[count] = splitted[i];
            //increment the counter
            count += 1;
        }

        return result;
    }
    //method for user input
    static String user_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance..");
        String sentence = sc.nextLine();
        return sentence;
    }
    public static void main(String[] args) {
        String x =  user_input();
        String [] result = wordReversal(x);
        //printing array
        for (int i = 0;i < result.length;i++){
            System.out.println(result[i]);
        }
         
    }
}
