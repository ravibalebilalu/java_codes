
/*Write a program to convert temperatures between
 Fahrenheit and Celsius. */
 import java.text.DecimalFormat;
 import java.util.Scanner;
 
  
 public class temperature_converter {
     //Fahrenheit to  Celsius
     static String  far_to_cel(double x){
         DecimalFormat df = new DecimalFormat("#0.00");
         return df.format((x-32)/1.8) + " \u00B0C";
     }
 //Celsius to Fahrenheit 
 static String cel_to_far(double x){
     DecimalFormat df = new DecimalFormat("#0.00");
     return df.format(x * (9.0/5.0) +32) + " \u00B0F";
 }
 
     public static void main(String[] args) {
        //let user to select the temperature scale
        Scanner selector = new Scanner(System.in);
        System.out.println("Select 1 for Fahrenheit to Celsius ");
        System.out.println("Select 2 for for Celsius to Fahrenheit  ");

        int selection  = selector.nextInt();
        if(selection == 1){
            //ask user to enter the temperature value
            System.out.println("Enter temperature value...");
            double fahrenheit = selector.nextDouble();
            System.out.println(far_to_cel(fahrenheit));}
        else if (selection == 2){
            //ask user to enter the temperature value
            System.out.println("Enter temperature value...");
            double  celsius = selector.nextDouble();
            System.out.println(cel_to_far(celsius));}
     }
 }
 