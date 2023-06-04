public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeter = 1.80;
        double weightKg = 93;
        int index = service.calculate(heightMeter, weightKg);
        System.out.println(index);

    }
}
