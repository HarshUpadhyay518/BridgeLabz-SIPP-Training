class Prototype implements Cloneable {
    String name;
    Prototype(String name) { this.name = name; }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype("Original Object");
        Prototype p2 = (Prototype) p1.clone();
        System.out.println("Cloned object name: " + p2.name);
    }
}
