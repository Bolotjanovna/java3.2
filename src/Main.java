public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = 1.7;
        int body = (int) service.calculate(index);
        System.out.println(body);
    }
}