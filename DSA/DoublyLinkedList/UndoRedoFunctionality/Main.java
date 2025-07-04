package DSA.DoublyLinkedList.UndoRedoFunctionality;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EditorHistory editor = new EditorHistory(10);

        int choice = -1;

        while (choice != 5) {
            System.out.println("\n--- Text Editor Undo/Redo Menu ---");
            System.out.println("1. Type new text state");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display current state");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter new text content: ");
                String content = sc.nextLine();
                editor.addState(content);
            }
            else if (choice == 2) {
                editor.undo();
            }
            else if (choice == 3) {
                editor.redo();
            }
            else if (choice == 4) {
                editor.displayCurrentState();
            }
            else if (choice == 5) {
                System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
