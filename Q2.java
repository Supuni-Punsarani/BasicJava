import java.util.*;

public class Q2 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your full name:");
        String first;
        System.out.println("Enter your first name:");
        first=scanner.next();
        String second;
        System.out.println("Enter your middle name:");
        second=scanner.next();
        String last;
        System.out.println("Enter your last name:");
        last=scanner.next();
        System.out.println(last+", "+first+" "+second.substring(0,1)+".");
    }






}
