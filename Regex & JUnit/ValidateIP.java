public class ValidateIP {
    public static void main(String[] args) {
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}$";

        String[] ips = {"192.168.1.1", "999.123.45.67"};

        for (String ip : ips) {
            System.out.println(ip + " → " + ip.matches(regex));
        }
    }
}
