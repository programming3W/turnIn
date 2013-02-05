/**
 *
 * Dec 3, 2012
 * @author mjohansen15
 */

package mj.formattedOut; 
import java.util.Locale;
import java.text.*;

public class sineFormat {

    public static void main(String[] args) {
        int degree = 0;
        double sine = 0;
        
        DecimalFormat prettyDeg = new DecimalFormat(" 00.0;-0.0");
        DecimalFormat prettySine = new DecimalFormat(" 0.0#####;-0.0#####");
        
        System.out.println("Degree\tSine");
        
        System.out.println();
        //System.out.println(Math.sin(-90));
        
        for(int i = -90; i <= 90; i = i + 15){
            degree = i;
            
            
                sine = Math.sin(Math.toRadians(degree));
                //System.out.println(sine);
                System.out.println(prettyDeg.format(degree) + "\t" + prettySine.format(sine));
            
        }
    }

}
