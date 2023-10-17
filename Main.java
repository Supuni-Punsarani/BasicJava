import java.util.*;

class Calculation {
    private double innerRadius;
    private double outerRadius;

    public void setRadius(double innerRadius, double outerRadius) {
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
    }

    public double computeArea() {
        return Math.PI * (Math.pow(outerRadius, 2) - Math.pow(innerRadius, 2));
    }

    public double computeCircumference() {
        return 2 * Math.PI * outerRadius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ir;
        System.out.println("Enter inner radius:");
        ir = scanner.nextDouble();
        double or;
        System.out.println("Enter outer radius:");
        or = scanner.nextDouble();

        Calculation myCircle = new Calculation();
        myCircle.setRadius(ir, or);

        double area = myCircle.computeArea();
        double circumference = myCircle.computeCircumference();

        System.out.println("Area of the circular region: " + area);
        System.out.println("Circumference of the circular region: " + circumference);
    }
}
