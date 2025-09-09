public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable job = () -> {
            System.out.println("Background job running...");
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
            System.out.println("Background job completed!");
        };
        Thread thread = new Thread(job);
        thread.start();
    }
}
