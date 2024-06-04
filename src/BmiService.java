public class BmiService {
    public int calculate(double bodyMass, double height) {
        int result;
        double bodyYndex = bodyMass / (height * height);
        result = (int) bodyYndex;
        return result;
    }
}
