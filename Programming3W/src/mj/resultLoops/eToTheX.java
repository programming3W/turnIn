/**
 *
 * Nov 12, 2012
 * @author mjohansen15
 */

package mj.resultLoops; 
import java.util.Scanner;

public class eToTheX {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("x? ");
        final int x = sc.nextInt();
        //  Our version of "N"
        
        double value = 0.0;
        //  Running value
        
        double term = 1.0;
        //  Var to hold value of x^n / n!
        //  != 0 b/c for loop conditions
        
//DEBUG        //int loops = 0;
        for(int i = 1; term > 1.0E-12; i++){
        //  for condition specifies termination, IE smallest term val possible (accuracy)  
            value += term;
            
//DEBUG            //System.out.println(x + " : " + i);
            
            term = (Math.pow(x , i)) / factorial(i);
            //  Cheating, you say?  I think not!  x^n / n!
            
            if(i % 3 == 0)
                System.out.println("loop count: " + i + "\t Term: " + term + "\t Total: " + value);
            //  Prints every 3rd time
            
//DEBUG            //loops++;
        }
//DEBUG        //System.out.println("Loops: " + loops);
        
        
        System.out.println("\r\nMy edition:   " + value);
        System.out.println("Java's value: " + Math.exp(x));
        
        double difference = Math.abs(value - Math.exp(x));
        ///////  Keeps variation positive
        
        System.out.println("Accuracy:     +-" + difference);
        //Accuracy
    }
    
    public static long factorial (int factorial){
        if (factorial <= 0)
            return 1;
        //  Run until this condition is reached, then use 1 to compute unsolved problems
        
        return factorial * factorial((factorial - 1));
    }
    /*
     * Recursion :)
     */
    
    
}