package DSA.JavaStreams;

import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        String sourceFile = "source.txt";       // input file
        String destinationFile = "destination.txt"; // output file

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File src = new File(sourceFile);

            // Check if source exists
            if (!src.exists()) {
                System.out.println("Source file does not exist: " + sourceFile);
                return;
            }

            fis = new FileInputStream(src);
            fos = new FileOutputStream(destinationFile); // creates file if not exist

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData); // write byte-by-byte
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);

        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing streams: " + e.getMessage());
            }
        }
    }
}
