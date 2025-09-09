import java.lang.reflect.*;

public class TaskManager {
    @TaskInfo(priority = "HIGH", assignedTo = "Alice")
    public void task1() {}

    @TaskInfo(priority = "LOW", assignedTo = "Bob")
    public void task2() {}

    public static void main(String[] args) throws Exception {
        Method[] methods = TaskManager.class.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo t = m.getAnnotation(TaskInfo.class);
                System.out.println(m.getName() + " -> priority:" + t.priority() + ", assignedTo:" + t.assignedTo());
            }
        }
    }
}
