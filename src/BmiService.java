public class BmiService {
    public int calculate(double height_meter, double weight_kg) {
        double index;
        int result;

        if ((height_meter > 0) && (weight_kg > 0)) {
            index = weight_kg / Math.pow(height_meter, 2);
        } else {
            index = 0.0;
        }
        result = (int) Math.round(index);
        return result;

    }
}
