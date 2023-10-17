import java.util.*;
public class Q1 {

    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        String word;
        System.out.println("Enter your word(It have odd length):");
        word=scanner.next();
        int middleName=word.length()/2;
        System.out.println(word.charAt(middleName));


    }
}
