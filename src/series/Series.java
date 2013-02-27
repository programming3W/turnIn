/**
 * Luke Adams
 * Series
 */

package series;

import java.math.BigInteger;
import java.util.Scanner;
import sun.security.util.BigInt;

public class Series {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int k;
	
	System.out.print("Problem 5 - 2ed Try\n  Enter k: ");
	k = scan.nextInt();
	System.out.println("  f(" + k + ") = " + (prob5b(k)));


    }

    private static double prob1(int k) {
	double result = 0;
	
	for(int n = 1; n <= k; n++) {
	    result += 1.0/n;
	}
	
	return result;
    }

    private static double prob2(int k) {
	double result = 0;
	
	for(int n = 1; n <= k; n++) {
	    result += 1.0/(n*n);
	}
	
	return result;
    }

    private static double prob3(int k) {
	double result = 0;
	
	for(int n = 0; n <= k; n++) {
	    result += Math.pow(0.5,n);
	}
	
	return result;
    }
    
    private static double prob4(int k) {
	if (k < 0) return 0;
	return (Math.pow(-1,k)*(1.0/(2*k+1))) + prob4(k - 1);
    }
    
    private static double prob5(int k) {
	double result = 1;
	long fact = 1;
	
	for(int n = 1; n <= k; n++) {
	    fact *= n;
	    result += 1.0/fact;
	}
	
	return result;
    }
    
    private static double prob5b(long k) {
	double result = 0, sub = 1;
	
	for(long i = 0; i <= k; i++) {
	    for(long j = 1; j <= i; j++) {
		sub *= 1.0/j;
	    }
	    
	    result += sub;
	    sub = 1;
	}
	
	return result;
    }
}