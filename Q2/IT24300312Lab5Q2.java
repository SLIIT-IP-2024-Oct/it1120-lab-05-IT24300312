import java.util.Scanner;
       public class IT24300312Lab5Q2 {
          public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);
              System.out.println("Enter the number of new members introduced:");
               int members = scanner.nextInt();

         if (members<0) {
          System.out.println("Number of members should be greater than 0");
         return;
        }
        
       switch(members) {
         case 0:
            System.out.println("No Prize");
                break;
         case 1:
            System.out.println("Prize: Pen");
                break;
         case 2:
            System.out.println("Prize: Umbrella");
                break;
         case 3:
            System.out.println("Prize: Bag");
                break;
         case 4:
            System.out.println("Prize: Travelling Chair");
                break;
         default:
            System.out.println("Prize: Headphones");
                break;
           }

     }
}