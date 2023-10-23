import java.util.*;

public class Q4 {

   public static void main(String[]args){

       Scanner scanner=new Scanner(System.in);
       System.out.println("enter five numbers:");
       int num[]=new int[5];
       for(int i = 0; i<5; i++) {
           int n = scanner.nextInt();
           num[i] = n;
       }

       int max=num[0];
       int secondMax=num[1];

       for(int i=0;i<5;i++){
           if (num[i] > max) {
               secondMax = max;  // Update secondMax
               max = num[i];     // Update max
           } else if (num[i] > secondMax && num[i] < max) {
               secondMax = num[i];  // Update secondMax
           }

       }

       System.out.println("Second largest element: " + secondMax);


   }
}
