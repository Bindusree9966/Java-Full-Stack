package Cognizant;

import java.util.Scanner;

public class fuelConsumption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int diesel=sc.nextInt();
        int distance=sc.nextInt();
        if((diesel | distance) < 0)
        {
            System.out.println("Invalid input");
        }
        int usfuel=(distance/diesel)*100;

    }
}
