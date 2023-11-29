public class MathOperations {
    static double pi=3.14159;
     double radius;

    double side;
    public static double calculateCircleArea (double radius){
        double area=pi*radius*radius;
        return area;
    }

    public static double calculateSquareArea(double side){
        double area=side*side;
        return area;
    }
}
