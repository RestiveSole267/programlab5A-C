//Class: CSE 132L
//Section: J08
//Term: Fall
//Instructor: Chandana Avadhani
//Name: Cameron White
//Lab#: 5

import java.util.Scanner;
public class Lab5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a driving permit (Y/N)? ");
        String drivingpraw = sc.nextLine();
        String drivingp = drivingpraw.toLowerCase();
        if (drivingp.equals("y")) {
            System.out.println("Do you have a commercial driving license (Y/N)? ");
            String commericalraw = sc.nextLine();
            String commerical = commericalraw.toLowerCase();
            if (commerical.equals("y")) {
                System.out.println("Congratulations! You can purchase a vehicle, let's start talking options!");
            }
            if (commerical.equals("n")) {
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
        }
        if (drivingp.equals("n")) {
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        }
    }
}
