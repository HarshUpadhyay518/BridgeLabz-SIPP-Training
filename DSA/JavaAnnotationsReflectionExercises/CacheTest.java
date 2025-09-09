import java.lang.reflect.*;
import java.util.*;

public class CacheTest {
    private Map<Integer,Integer> cache = new HashMap<>();

    @CacheResult
    public int computeSquare(int x) {
        System.out.println("Computing square of " + x);
        return x*x;
    }

    public static void main(String[] args) throws Exception {
        CacheTest obj = new CacheTest();
        Method m = CacheTest.class.getDeclaredMethod("computeSquare", int.class);
        for (int i=0;i<2;i++) {
            int input = 5;
            if (obj.cache.containsKey(input)) {
                System.out.println("From cache: " + obj.cache.get(input));
            } else {
                int result = (int)m.invoke(obj, input);
                obj.cache.put(input, result);
                System.out.println("Computed: " + result);
            }
        }
    }
}
