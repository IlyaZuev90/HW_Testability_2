public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height_meter = 1.80;
        double weight_kg = 93;
        int index = service.calculate(height_meter, weight_kg);
        System.out.println(index);

    }
}
