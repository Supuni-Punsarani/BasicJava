import java.util.*;
class SampleWindow{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        System.out.print("Enter your first name: ");
        firstName = scanner.next( );
        String middleName;
        System.out.println("Enter your middle name:");
        middleName=scanner.next();
        String lastName;
        System.out.println("enter your last name:");
        lastName=scanner.next();

        //---------
        System.out.println("Nice to meet you, "+lastName.substring(0,1)+"." + middleName.substring(0,1)+"."+firstName);*/
        System.out.println("shopping list:");
        System.out.println("   Apple");
        System.out.println("   Apple");
        System.out.println("   Apple");

         //--------
        String country;
        country = "Sri Lanka";
        System.out.print(country.indexOf("Lanka"));
        System.out.println(country.length());

         //----------
        String java;
        java = "I Love Java and Java loves me.";
        System.out.println(java.indexOf("love"));

    }
}

