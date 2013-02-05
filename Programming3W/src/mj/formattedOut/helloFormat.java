/**
 *
 * Dec 3, 2012
 *
 * @author mjohansen15
 */
package mj.formattedOut;

import java.util.Locale;
import java.text.*;

public class helloFormat {

    public static void main(String[] args) {
        double A = 24.8, B = -92.777, C = 0.009, D = -0.123;

        DecimalFormat numform = new DecimalFormat(" 00.00;-00.00");

        System.out.println("A = " + numform.format(A));
        System.out.println("B = " + numform.format(B));
        System.out.println("C = " + numform.format(C));
        System.out.println("D = " + numform.format(D));
    }
}
