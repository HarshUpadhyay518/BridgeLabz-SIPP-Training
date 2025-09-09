import java.lang.reflect.*;

public class TodoTest {
    @Todo(task="Implement login", assignedTo="Charlie", priority="HIGH")
    public void login() {}

    @Todo(task="Add logout feature", assignedTo="Dana")
    public void logout() {}

    public static void main(String[] args) throws Exception {
        for (Method m : TodoTest.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(m.getName() + " -> task:" + t.task() + ", assignedTo:" + t.assignedTo() + ", priority:" + t.priority());
            }
        }
    }
}
