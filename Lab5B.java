//Class: CSE 132L
//Section: J08
//Term: Fall
//Instructor: Chandana Avadhani
//Name: Cameron White
//Lab#: 5

import java.util.Scanner;
public class Lab5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer = sc.nextInt();

        switch (integer % 2) {
            case 0:
                System.out.println("This number is divisible by 2");
                break;
            default:
                switch (integer % 3) {
                    case 0:
                        System.out.println("This number is divisible by 3");
                        break;
                    default:
                        switch (integer % 5) {
                            case 0:
                                System.out.println("This number is divisible by 5");
                                break;
                            default:
                                System.out.println("This number is undetermined");
                        }
                }
        }
    }
}
