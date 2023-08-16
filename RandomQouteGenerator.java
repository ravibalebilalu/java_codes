import java.util.Random;
public class RandomQouteGenerator {
    public static void main(String[] args) {
        //some random qoutes from internet
        String [] qoutes = {
            "We are what we repeatedly do. Excellence, then, is not an act, but a habit.",
            "Consistency is the key! If you can't be consistent, then you can't be anything.",
            "Success is the sum of small efforts, repeated day in and day out.",
            "One day, all your hard work will pay off.",
            "The earlier you start working on something, the earlier you will see results.",
            "Life is short. Live it. Fear is natural. Face it. Memory is powerful. Use it.",
            "Do what is right, not what is easy.",
            "It’s never too late to be what you might have been.",
            "Either you run the day or the day runs you.",
            "The future depends on what you do today."
        }; 
        //create random number generater object
        Random random = new Random();
        //create a random integer: upperlimit is length of array
        int randomIndex = random.nextInt(qoutes.length);
        //print the array element whose index is a random number
        System.out.println( qoutes[randomIndex]);
          
         
         
         
            
        

    }
}
