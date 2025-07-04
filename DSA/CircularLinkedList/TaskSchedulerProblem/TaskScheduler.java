package DSA.CircularLinkedList.TaskSchedulerProblem;

public class TaskScheduler {
    private TaskNode head = null;
    private TaskNode current = null;

    // Add at beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TaskNode last = head;
            while (last.next != head) {
                last = last.next;
            }
            newNode.next = head;
            head = newNode;
            last.next = head;
        }
        System.out.println("Task added at the beginning.");
    }

    // Add at end
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TaskNode last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = head;
        }
        System.out.println("Task added at the end.");
    }

    // Add at position (1-based)
    public void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (pos == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;
        int count = 1;
        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Task added at position " + pos + ".");
    }

    // Remove by Task ID
    public void removeByID(int id) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode curr = head;
        TaskNode prev = null;

        do {
            if (curr.taskID == id) {
                if (curr == head && head.next == head) {
                    head = null;
                } else if (curr == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Task with ID " + id + " removed.");
                if (current == curr) current = head;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Task ID not found: " + id);
    }

    // View current task and move to next
    public void viewCurrentAndNext() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        if (current == null) current = head;

        System.out.println("\nCurrent Task:");
        displayTask(current);

        current = current.next;
    }

    // Display all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        System.out.println("\n--- Task List ---");
        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }

        boolean found = false;
        TaskNode temp = head;
        System.out.println("\n--- Search Results ---");
        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority " + priority + ".");
        }
    }

    private void displayTask(TaskNode node) {
        System.out.println("ID: " + node.taskID + ", Name: " + node.taskName +
                ", Priority: " + node.priority + ", Due Date: " + node.dueDate);
    }
}
