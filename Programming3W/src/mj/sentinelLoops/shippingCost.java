/**
 *
 * Nov 12, 2012
 * @author mjohansen15
 */

package mj.sentinelLoops; 
import java.util.Scanner;

public class shippingCost {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int input = 1;
        double price = 3.00;
        while (input > 0) {
            System.out.print("Weight (to the nearest pound)? ");
            input = sc.nextInt();
            if(input <= 0)
                continue;
            
            if(input > 10)
                price += (input - 10) * .25;
            
            System.out.print("Shipping cost: ");
            System.out.printf("$%2.2f", price);
            System.out.println();
            
        }
        System.out.println("Bye!");
        
    }

}
