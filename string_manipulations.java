/*  Create functions to find
 the length of a string, concatenate two strings,
  and convert a string to uppercase or lowercase.
   */
public class string_manipulations{
    //method to find length of string
    static int stringLength(String str){
    //initiate counter
     int count =0;
     //iterate string by coverting it to char array 
     for (char c:str.toCharArray()){
        //increament count by 1 for each iteration
        count++;
     }
     return count;
    }
    //method to concatenate two strings
    static String concatenateStrings(String x,String y){
        return x + " " +y;
    }
    //method to convert all letters to upper case
    static String toupper(String x){
        //create empty string
        String result = "";
        //iterate splitted string 
        for (int i=0;i<x.split(" ", 0).length;i++){
            //convert each word to uppercase and store in result string
            result += x.split(" ",0)[i].toUpperCase() + " ";
        }
        
        return result;
    }
    //method to convert all letters to lower case
    static String tolower(String x){
        //create empty string
        String result = "";
        //iterate splitted string 
        for (int i=0;i<x.split(" ", 0).length;i++){
            //convert each word to lowercase and store in result string
            result += x.split(" ",0)[i].toLowerCase() + " ";
        }
        
        return result;
    }

    public static void main(String[] args) {
        
    
        String example = "Java is awesome!";
        System.out.println("Length of string is : "+ stringLength(example));

        String x = "Java is";
        String y = "Awesome language";
        String z = concatenateStrings(x, y);
        
        //"\n" used to seperate the results
        System.out.print(tolower(z) + "\n");
        System.out.print(toupper(z));
         

        




}
}