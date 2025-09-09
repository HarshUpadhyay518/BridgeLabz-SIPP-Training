import java.lang.reflect.*;

public class ImportantTest {
    @ImportantMethod
    public void method1() {}

    @ImportantMethod(level="LOW")
    public void method2() {}

    public static void main(String[] args) throws Exception {
        for (Method m : ImportantTest.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " -> level: " + im.level());
            }
        }
    }
}
