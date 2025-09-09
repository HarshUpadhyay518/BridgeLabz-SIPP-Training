import java.lang.reflect.*;

public class BugTest {
    @BugReport(description="Null pointer issue")
    @BugReport(description="Array index out of bounds")
    public void buggyMethod() {}

    public static void main(String[] args) throws Exception {
        Method m = BugTest.class.getDeclaredMethod("buggyMethod");
        BugReport[] reports = m.getAnnotationsByType(BugReport.class);
        for (BugReport br : reports) {
            System.out.println("Bug: " + br.description());
        }
    }
}
