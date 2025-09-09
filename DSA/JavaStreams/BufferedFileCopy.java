package DSA.JavaStreams;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        String source = "largefile.dat";
        String dest1 = "copy_unbuffered.dat";
        String dest2 = "copy_buffered.dat";

        copyWithUnbuffered(source, dest1);
        copyWithBuffered(source, dest2);
    }

    // Unbuffered (FileInputStream + FileOutputStream)
    public static void copyWithUnbuffered(String src, String dest) {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {
            long start = System.nanoTime();
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            long end = System.nanoTime();
            System.out.println("Unbuffered Copy Time: " + (end - start) / 1_000_000 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Buffered (BufferedInputStream + BufferedOutputStream)
    public static void copyWithBuffered(String src, String dest) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            long start = System.nanoTime();
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            long end = System.nanoTime();
            System.out.println("Buffered Copy Time: " + (end - start) / 1_000_000 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}