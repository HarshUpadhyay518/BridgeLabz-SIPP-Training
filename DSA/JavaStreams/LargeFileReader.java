package DSA.JavaStreams;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String file = "large_log.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

