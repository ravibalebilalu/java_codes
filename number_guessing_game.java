/*Create a guessing game where the program generates 
a random number, and the user has to guess it.
 Provide hints like "too high" or "too low" 
 after each guess.*/

//import random 
import java.util.Random;
 //import scanner
import java.util.Scanner;
//number generation
public class number_guessing_game{
    //method for random number generation
    static int number_generator(){
        Random random = new Random();
        int x = random.nextInt(5);
        return x;
    }
     


    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      
    //initialize random number generator
     int actual_number = number_generator();
     //initialize counter to track attempts
     int attempt = 0;
      //for loop used to give 5 chance for player
    for (int i = 0;i<5;i++){
        System.out.println("Gues the number...");
        //ask the user to enter guessed number
        int guessed = sc.nextInt(); 
        //give hints and results 
        if(guessed == actual_number && attempt < 5){
            System.out.println("You got it!");
            attempt += 1;
            break;
        }else if (guessed > actual_number && attempt < 5){
            attempt += 1;
            if(attempt == 5){
                System.out.println("You lost!");
            break;
        }
            System.out.println("Too high!");
        }else if (attempt < 5){
            attempt += 1;
            if(attempt == 5){
                System.out.println("You lost!");
                break;
            }
            System.out.println("Too low!");
        }else if (attempt == 5 && (!(guessed == actual_number))){
            System.out.println("You lost!");
        }     
             
    }
     //print total attempts
    System.out.println("You took "+ attempt +" attempts!");
     
    }
}