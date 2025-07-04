
package DSA.CircularLinkedList.RoundRobinSchedulingAlgorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Round Robin Scheduling Algorithm ===");
        System.out.print("Enter Time Quantum: ");
        int quantum = sc.nextInt();

        RoundRobinScheduler scheduler = new RoundRobinScheduler(quantum);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Process");
            System.out.println("2. Display Processes");
            System.out.println("3. Simulate Scheduling");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Process ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Burst Time: ");
                int burst = sc.nextInt();

                System.out.print("Enter Priority: ");
                int priority = sc.nextInt();

                scheduler.addProcess(id, burst, priority);

            } else if (choice == 2) {
                scheduler.displayProcesses();

            } else if (choice == 3) {
                scheduler.simulate();

            } else if (choice == 4) {
                System.out.println("Exiting program. Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
