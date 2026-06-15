package collectionframeworks.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class spotify {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        q.add("Kurise Kurise");
        q.add("Manasantha");
        q.add("Neeve Neeve");
        q.add("Sundari");
        q.add("Yenno Yenno");
        q.add("Uppenantha Ee Premalo");
        q.add("Yenti Yenti");
        q.add("Seethakaalam");
        q.add("Chikiri Chikiri");
        q.add("Rooba Rooba");

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add Song");
        System.out.println("2. Remove Current Song");
        System.out.println("3. Current Playing Song");
        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter Song Name: ");
                String song = sc.nextLine();
                q.add(song);
                System.out.println(song + " added successfully.");
                break;
            case 2:
                    System.out.println("Removed Song: " + q.poll());
                break;

            case 3:
                    System.out.println("Currently Playing: " + q.peek());
                break;

            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("\nPlaylist: " + q);
        sc.close();
    }
}