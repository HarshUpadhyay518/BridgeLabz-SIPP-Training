import java.lang.reflect.*;

public class ExecutionTimeTest {
    @LogExecutionTime
    public void slowMethod() {
        for (int i=0; i<1000000; i++); // simulate work
    }

    @LogExecutionTime
    public void fastMethod() {
        for (int i=0; i<1000; i++);
    }

    public static void main(String[] args) throws Exception {
        ExecutionTimeTest obj = new ExecutionTimeTest();
        for (Method m : ExecutionTimeTest.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                m.invoke(obj);
                long end = System.nanoTime();
                System.out.println(m.getName() + " executed in " + (end-start) + " ns");
            }
        }
    }
}
