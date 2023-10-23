import java.util.*;

public class Q2 {

    public static void main(String[]args){

         while(true){
             Scanner scanner=new Scanner(System.in);
             System.out.println("Enter value:");
             int num=scanner.nextInt();

             if(num>=0){
                  int n=nnumber(num);
                  System.out.println("Number of digits this number have: "+n);
             }
             else{
                 break;
             }
         }
    }

    private static int nnumber(int num) {
        int count=0;
        while(num>0){

            num/=10;
            count+=1;

        }

        return count;

    }
}
