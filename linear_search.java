/*Implement a function to perform a linear search 
for an element in an array. */
public class linear_search{
    //method for linear search
    static int linearSearch(int [] x,int number){
        //initiate result variable
        int result = 0;
        //iterate array

        for (int i=0;i < x.length;i++){
            //search for given number
            if (x[i] == number){
                //stop if found
                result = i;
                break;
                //if not found result will be -1
            }else {result = -1;}
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {3,4,5,6};
        int number = 5;
        System.out.println(linearSearch(arr, number));
    }
}