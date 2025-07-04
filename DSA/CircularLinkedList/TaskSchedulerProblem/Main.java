package DSA.CircularLinkedList.TaskSchedulerProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        int choice;
        do {
            System.out.println("\n=== Task Scheduler Menu ===");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Specific Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Current Task and Move to Next");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Tasks by Priority");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter Task ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Task Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Priority: ");
                int priority = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Due Date: ");
                String dueDate = sc.nextLine();

                if (choice == 1) scheduler.addAtBeginning(id, name, priority, dueDate);
                else if (choice == 2) scheduler.addAtEnd(id, name, priority, dueDate);
                else {
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();
                    scheduler.addAtPosition(pos, id, name, priority, dueDate);
                }
            }
            else if (choice == 4) {
                System.out.print("Enter Task ID to remove: ");
                int id = sc.nextInt();
                scheduler.removeByID(id);
            }
            else if (choice == 5) {
                scheduler.viewCurrentAndNext();
            }
            else if (choice == 6) {
                scheduler.displayAllTasks();
            }
            else if (choice == 7) {
                System.out.print("Enter Priority to search: ");
                int priority = sc.nextInt();
                scheduler.searchByPriority(priority);
            }
            else if (choice == 8) {
                System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}
