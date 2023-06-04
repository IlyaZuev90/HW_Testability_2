public class BmiService {
    public int calculate(double heightMeter, double weightKg) {
        double index;
        int result;

        if ((heightMeter > 0) && (weightKg > 0)) {
            index = weightKg / Math.pow(heightMeter, 2);
        } else {
            index = 0.0;
        }
        result = (int) Math.round(index);
        return result;

    }
}
