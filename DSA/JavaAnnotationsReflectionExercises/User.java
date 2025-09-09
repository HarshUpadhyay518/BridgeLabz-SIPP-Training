import java.lang.reflect.*;

public class User {
    @MaxLength(10)
    private String username;

    public User(String username) throws Exception {
        Field f = User.class.getDeclaredField("username");
        MaxLength ml = f.getAnnotation(MaxLength.class);
        if (username.length() > ml.value()) {
            throw new IllegalArgumentException("Username exceeds max length " + ml.value());
        }
        this.username = username;
    }

    public String getUsername() { return username; }

    public static void main(String[] args) throws Exception {
        try {
            User u1 = new User("shortName");
            System.out.println("Created user: " + u1.getUsername());
            User u2 = new User("ThisNameIsTooLong");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
