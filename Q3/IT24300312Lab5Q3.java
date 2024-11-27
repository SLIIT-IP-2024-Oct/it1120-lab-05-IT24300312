import java.util.Scanner;
      public class IT24300312Lab5Q3 {
        public static void main(String[]args) {
          final int roomCharges = 48000;
          Scanner scanner = new Scanner(System.in);

          System.out.println("Enter the start date from (1-31): ");
          int startDate = scanner.nextInt();

          System.out.println("Enter the end date from (1-31): ");
          int endDate = scanner.nextInt();

          if(startDate<1 || startDate>31 || endDate<1 || endDate>31) {
               System.out.println("Error: Dates must be between 1 and 31");
                return;
                   }
          if(startDate>=endDate) {
            System.out.println("Error: Start date must be less than end date.");
                return;
                   }

          int daysReserved = endDate-startDate;
          double  discountRate = 0;
 
          if(daysReserved >=3 || daysReserved<=4) {
            discountRate = 10;
          } else if (daysReserved >=5) {
            discountRate = 20;
          }

          double totalCost = daysReserved*roomCharges;
          double discount = totalCost*(discountRate/100.0);
          double finalAmount = totalCost + discount;

          System.out.println("Number of days reserved: "+daysReserved);
          System.out.println("Total amount before discount: Rs. " +totalCost);
          System.out.println("Discount: Rs. " +discount);
          System.out.println("Final amount to be paid: Rs. " +finalAmount);

              }
}