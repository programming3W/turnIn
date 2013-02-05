/**
 *
 * Nov 8, 2012
 * @author mjohansen15
 */

package mj.sentinelLoops; 
import java.util.Scanner;

public class sumInts {
    public static Scanner sc = new Scanner(System.in);
    String suffix;

    public static void main(String[] args) {
        for(int i = 0; i < 25; i++)
            System.out.println(i + suffixParser(i));
    }
    
    public static String suffixParser(int x){
        String xString;
        xString = Integer.toString(x);
        if(x > 20){
            x = Integer.parseInt(Character.toString(xString.charAt(xString.length() - 1)));
        }
        //System.out.println(x);
        
        switch(x){
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
        
    }

}
