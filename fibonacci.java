 /*Write a program to generate the Fibonacci series 
 up to a given number of terms */
 import java.util.Scanner;
 public class fibonacci {
    //method to generate Fibonacci series upto given number
    static int[] fibonacci_series(int  x){
        //initialize int array of size x
        int [] series = new int[x];
        //first Fibonacci number
        int f1 = 0;
        //second Fibonacci number
        int f2 = 1;
        //third Fibonacci number
        int f3 =0;
        //first element of Fibonacci series
        if (x >=1){
        series[0] = f1;
    }
        //second element of Fibonacci series
        if(x >= 2){
            series[1] = f2;
        }
        
         //for the range of given number x check for Fibonacci number
        for (int i = 2;i < x;i++){
            //third number = first number + second number
            f3 = f2 + f1;
            //first number = second number
            f1 = f2;
            //second number = third number
            f2 = f3;
            //limit the range and store the Fibonacci number in series
            if(f3 <= x){
                 
            series[i] = f3;
            
            }else{
                //if range goes beyond given number x stop
                break;
            }

        }
        return series;
    }


    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ....");
    int number = sc.nextInt();
    
      int [] series = fibonacci_series(number);
       /*we taken  the size of series array equal to the given number
      as a result our resulting array contains unwanted zeros
      Therefore we have to filter all zeroes.but there must be a zroe at starting.*/

      System.out.println(0);
      for(int i:series){
        if(i!=0){
        System.out.println(i);}
      }
    }
 }
