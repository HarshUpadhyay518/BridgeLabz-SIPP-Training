import java.lang.reflect.*;

public class AccessControlTest {
    private String currentRole = "USER";

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed");
    }

    public static void main(String[] args) throws Exception {
        AccessControlTest obj = new AccessControlTest();
        Method m = AccessControlTest.class.getDeclaredMethod("adminTask");
        RoleAllowed ra = m.getAnnotation(RoleAllowed.class);
        if (ra.value().equals(obj.currentRole)) {
            m.invoke(obj);
        } else {
            System.out.println("Access Denied!");
        }
    }
}
