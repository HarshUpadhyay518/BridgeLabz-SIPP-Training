
package DSA.CircularLinkedList.TaskSchedulerProblem;

public class TaskNode {
    int taskID;
    String taskName;
    int priority;
    String dueDate;

    TaskNode next;

    public TaskNode(int taskID, String taskName, int priority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

