public class Problem10_ValidateIPAddress {
    public static void main(String[] args) {
        String[] ips = {"192.168.1.1", "256.100.50.0", "10.0.0.256"};
        String regex = "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$";

        for (String ip : ips) {
            System.out.println(ip + " → " + ip.matches(regex));
        }
    }
}
