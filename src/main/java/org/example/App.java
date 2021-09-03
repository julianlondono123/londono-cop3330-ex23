import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        String yes = "y";
        String no = "no";
        String user;

        System.out.println("Is the car silent when you turn the key?");
        user = input.next();

        if(user.equals(yes)){
            System.out.println("Are the car battery terminals corroded");
            user = input.next();
            if (user.equals(yes)) {
                System.out.println("Clean the terminals are start trying again");
            }
            else {
                System.out.println("Replace the cables and try again");
            }
        }
        else {
            System.out.println("Does the car battery make a slicking noise");
            user = input.next();
            if (user.equals(yes)){
                System.out.println("Replace the battery");
            }
            else {
                System.out.println("Does the crank up but fail to start");
                user = input.next();

                if (user.equals(yes)) {
                    System.out.println("Check the spark plug connection");
                }
                else {
                    System.out.println("Does the engine start and then die?");
                    user = input.next();
                    if(user.equals(yes)) {
                        System.out.println("Does the car have fuel injection");
                        user = input.next();
                        if (user.equals(yes)) {
                            System.out.println("Get it in for service");
                        }
                        else {
                        System.out.println("Check to ensure the choke is opening and closing");
                        }
                    }
                    else {
                        System.out.println("This should not be possible");
                    }
                }
            }
        }
    }
}
