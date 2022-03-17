package com.company;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int userInput = 0;
        while(userInput != 5) {
            showMenu();
            userInput = Integer.parseInt(input.nextLine());

            if(userInput == 1) {
                //rentCar()
                System.out.println("rent");
            }

            if(userInput == 2) {
                //showRentCars()
                System.out.println("show");
            }

            if(userInput == 3) {
                //writeToFile()
                System.out.println("write");
            }

            if(userInput == 4) {
                //readFile()
                System.out.println("read");
            }

            }
        }

    public static void showMenu() {
        System.out.println("1. Rent car");
        System.out.println("2. Show rent cars");
        System.out.println("3. Record to file");
        System.out.println("4. Read file");
        System.out.println("5. Log out");
    }
}
