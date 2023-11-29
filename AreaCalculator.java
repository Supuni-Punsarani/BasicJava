public class AreaCalculator {
    double length;
    double width;
    double sideLength;
    public static double calculateRectangleArea(double length,double width){
        double area=length*width;
        return area;
    }
    public static double calculateSquareArea(double sideLength){
        double area=sideLength*sideLength;
        return area;
    }

    public static void main(String[]args){
        double rectangleLength=5;
        double  rectangleWidth=8;
        double squareSideLength=4;
        double a=calculateRectangleArea(rectangleLength, rectangleWidth);
        System.out.println(a);
        double b=calculateSquareArea(squareSideLength);
        System.out.println(b);

    }
}
