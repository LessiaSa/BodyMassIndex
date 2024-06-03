//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMass = 98.00d;
        double height = 1.87d;
        int index = service.calculate(bodyMass, height);
        System.out.println(index);
    }
}
