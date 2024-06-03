public class BmiService {
    public int calculate(double bodyMass, double height) {
        int result;
        double i = bodyMass / (height * height);
        result = (int) i;
        return result;
    }
}
