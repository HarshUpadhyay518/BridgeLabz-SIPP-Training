package DSA.LinkedList.SinglyLinkedList;

import java.util.Scanner;

class StudentNode {
    int rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;

    public StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    StudentNode head;

    // Add at Beginning
    public void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
        System.out.println("Student added at the beginning.");
    }

    // Add at End
    public void addAtEnd(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            System.out.println("Student added at the end.");
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Student added at the end.");
    }

    // Add at Specific Position (1-based)
    public void addAtPosition(int position, int roll, String name, int age, String grade) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Student added at position " + position + ".");
    }

    // Delete by Roll Number
    public void deleteByRollNumber(int roll) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNumber == roll) {
            head = head.next;
            System.out.println("Student with Roll Number " + roll + " deleted.");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student with Roll Number " + roll + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student with Roll Number " + roll + " deleted.");
        }
    }

    // Search by Roll Number
    public void searchByRollNumber(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Student Found:");
                System.out.println("Roll Number: " + temp.rollNumber);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + roll + " not found.");
    }

    // Display All Students
    public void displayAll() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("Student Records:");
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    // Update Grade by Roll Number
    public void updateGrade(int roll, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll Number " + roll + ".");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + roll + " not found.");
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();

        int choice = 0;
        System.out.println("\n--- Student Record Management ---");

        while (choice != 8) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student at Beginning");
            System.out.println("2. Add Student at End");
            System.out.println("3. Add Student at Position");
            System.out.println("4. Delete Student by Roll Number");
            System.out.println("5. Search Student by Roll Number");
            System.out.println("6. Display All Students");
            System.out.println("7. Update Student Grade by Roll Number");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // clear newline

            if (choice == 1) {
                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Grade: ");
                String grade = sc.nextLine();
                list.addAtBeginning(roll, name, age, grade);
            }
            else if (choice == 2) {
                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Grade: ");
                String grade = sc.nextLine();
                list.addAtEnd(roll, name, age, grade);
            }
            else if (choice == 3) {
                System.out.print("Enter Position: ");
                int pos = sc.nextInt();
                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Grade: ");
                String grade = sc.nextLine();
                list.addAtPosition(pos, roll, name, age, grade);
            }
            else if (choice == 4) {
                System.out.print("Enter Roll Number to Delete: ");
                int roll = sc.nextInt();
                list.deleteByRollNumber(roll);
            }
            else if (choice == 5) {
                System.out.print("Enter Roll Number to Search: ");
                int roll = sc.nextInt();
                list.searchByRollNumber(roll);
            }
            else if (choice == 6) {
                list.displayAll();
            }
            else if (choice == 7) {
                System.out.print("Enter Roll Number to Update: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter New Grade: ");
                String newGrade = sc.nextLine();
                list.updateGrade(roll, newGrade);
            }
            else if (choice == 8) {
                System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}

