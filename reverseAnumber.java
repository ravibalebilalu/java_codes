//reverse an integer string method
import java.util.Scanner;
class reverseAnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer ");
 try{  
        int number =  sc.nextInt();
        System.out.println("Original number : " + number );
        int sign = 1;


    if(number < 0){
                    sign = -1;
                    number = number * sign;
                    }
    String num = String.valueOf(number);
    String result = "";
    for(int i = num.length() - 1;i >= 0;i--){
         result += num.charAt(i);
    }
    int finNum = Integer.parseInt( result);
    System.out.println("Reversed number : " + finNum * sign);
}catch(Exception e){
        
    System.out.println("Enter a valied number!");
}
    
    }
}