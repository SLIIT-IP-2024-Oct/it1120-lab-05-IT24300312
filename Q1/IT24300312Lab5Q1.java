import java.util.Scanner;
       public class IT24300312Lab5Q1 {
          public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter three different integers");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
           
          int smallest = Math.min(number1,Math.min(number2,number3));
          int largest = Math.max(number1,Math.max(number2,number3));

          System.out.println("The smallest number is:" +smallest);
          System.out.println("The largest number is:" +largest);

          }
   }