/**
 *
 * Nov 12, 2012
 *
 * @author mjohansen15
 */
package mj.sentinelLoops;

import java.util.Scanner;

public class loginSim {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        loginSimUser joy = new loginSimUser("joy", "sun", 4);
        loginSimUser gates = new loginSimUser("gates", "monopoly", 1);
        loginSimUser jobs = new loginSimUser("jobs", "apple", 3);
        loginSimUser root = new loginSimUser("root", "secret", 5);
        loginSimUser quit = new loginSimUser("quit", "exit", 1);
        String userName = "", password = "";

        while (!(userName.equalsIgnoreCase(quit.userName) && password.equalsIgnoreCase(quit.password))) {
            System.out.print("User name? ");
            userName = sc.nextLine();
            System.out.print("Password? ");
            password = sc.nextLine();

            if (userName.equalsIgnoreCase(joy.userName) && password.equalsIgnoreCase(joy.password)) {
                System.out.println("Logged in with priority " + joy.priority);
            }
            else if (userName.equalsIgnoreCase(gates.userName) && password.equalsIgnoreCase(gates.password)) {
                System.out.println("Logged in with priority " + gates.priority);
            }
            else if (userName.equalsIgnoreCase(jobs.userName) && password.equalsIgnoreCase(jobs.password)) {
                System.out.println("Logged in with priority " + jobs.priority);
            }
            else if (userName.equalsIgnoreCase(root.userName) && password.equalsIgnoreCase(root.password)) {
                System.out.println("Logged in with priority " + root.priority);
            } 
            else if ((userName.equalsIgnoreCase(quit.userName) && password.equalsIgnoreCase(quit.password)))
                continue;
            else {
                System.out.println("Incorrect user/password combo");
            }
        }
        System.out.println("Goodbye!");

    }
}
