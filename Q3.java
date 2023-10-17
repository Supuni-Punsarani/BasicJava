import java.util.*;

public class Q3 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        double centimeter;
        System.out.println("enter length as centimeters:");
        centimeter=scanner.nextDouble();
        int feet= (int) ((int)centimeter/30.4);
        int inch=(int)((centimeter%30.4)/2.54);
        System.out.println(feet +"feets "+inch +"inches");




    }
}
