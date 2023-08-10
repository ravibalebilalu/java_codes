import java.util.Random;

import java.util.Scanner;
//number generation
public class number_guessing_game{
    static int number_generator(){
        Random random = new Random();
        int x = random.nextInt(5);
        return x;
    }
    //catch the number
    static String number_catcher(int actual,int guessed){
         
         if(guessed > actual){
            return "It is smaller than this";
        }else {
            return "It is bigger than this";
        }
    }


    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      
    
     int actual_number = number_generator();
     int attempt = 0;
      
    for (int i = 0;i<5;i++){
        System.out.println("Gues the number...");
        int guessed = sc.nextInt();  
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
            System.out.println("You are guessing too hogh!");
        }else if (attempt < 5){
            attempt += 1;
            if(attempt == 5){
                System.out.println("You lost!");
                break;
            }
            System.out.println("You are guesing too low!");
        }else if (attempt == 5 && (!(guessed == actual_number))){
            System.out.println("You lost!");
        }     
             
    }
     
    System.out.println("You took "+ attempt +" attempts!");
     
    }
}