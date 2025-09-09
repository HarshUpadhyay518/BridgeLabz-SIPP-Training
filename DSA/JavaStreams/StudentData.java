package DSA.JavaStreams;

import java.io.*;

public class StudentData {
    public static void main(String[] args) {
        String file = "student.dat";

        // Write
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(3.9);
            System.out.println("Student data written.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Student Data: Roll=" + roll + ", Name=" + name + ", GPA=" + gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
