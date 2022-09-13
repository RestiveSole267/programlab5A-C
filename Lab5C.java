//Class: CSE 132L
//Section: J08
//Term: Fall
//Instructor: Chandana Avadhani
//Name: Cameron White
//Lab#: 5

import java.util.Scanner;
public class Lab5C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();

        if (x == 0){
            if (y == 0){
                System.out.println("This point is on the origin.");
            }
            if (y > 0){
                System.out.println("This point is on the y axis.");
            }
            if (y < 0){
                System.out.println("This point is on the y axis.");
            }
        }
        if (y == 0){
            if (x > 0){
                System.out.println("This point is on the x axis.");
            }
            if (x < 0){
                System.out.println("This point is on the x axis.");
            }
        }
        if (x > 0){
            if(y > 0){
                System.out.println("This point is in the first quadrant.");
            }
            if(y < 0){
                System.out.println("This point is in the fourth quadrant.");
            }
        }
        if (x < 0){
            if (y < 0){
                System.out.println("This point is in the third quadrant.");
            }
            if (y > 0){
                System.out.println("This point is in the second quadrant.");
            }
        }
    }
}
