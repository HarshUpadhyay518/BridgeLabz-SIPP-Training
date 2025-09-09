import java.lang.reflect.*;
import java.util.*;

public class JsonUser {
    @JsonField(name="user_name")
    private String username;

    @JsonField(name="user_age")
    private int age;

    public JsonUser(String username, int age) {
        this.username = username; this.age = age;
    }

    public static String toJson(Object obj) throws Exception {
        StringBuilder sb = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i=0; i<fields.length; i++) {
            Field f = fields[i];
            if (f.isAnnotationPresent(JsonField.class)) {
                f.setAccessible(true);
                JsonField jf = f.getAnnotation(JsonField.class);
                sb.append("\"").append(jf.name()).append("\":\"").append(f.get(obj)).append("\"");
                if (i < fields.length-1) sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        JsonUser u = new JsonUser("Alice", 25);
        System.out.println(JsonUser.toJson(u));
    }
}
