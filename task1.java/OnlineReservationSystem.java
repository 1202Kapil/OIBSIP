import java.util.Scanner;

public class OnlineReservationSystem {
   static int[][] seats = new int[10][10]; // 10 rows and 10 columns
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      while (true) {
         System.out.print("Enter 1 for first class, 2 for economy class, or 0 to exit: ");
         int choice = input.nextInt();
         
         if (choice == 0) {
            System.out.println("Thank you for using our reservation system. Goodbye!");
            break;
         }
         
         reserveSeat(choice);
      }
   }
   
   public static void reserveSeat(int choice) {
      int row = 0, col = 0;
      boolean seatFound = false;
      if (choice == 1) { // first class
         for (int i = 0; i < 5; i++) { // check rows 0-4
            for (int j = 0; j < 10; j++) { // check columns 0-9
               if (seats[i][j] == 0) {
                  row = i;
                  col = j;
                  seatFound = true;
                  break;
               }
            }
            if (seatFound) break;
         }
      } else if (choice == 2) { // economy class
         for (int i = 5; i < 10; i++) { // check rows 5-9
            for (int j = 0; j < 10; j++) { // check columns 0-9
               if (seats[i][j] == 0) {
                  row = i;
                  col = j;
                  seatFound = true;
                  break;
               }
            }
            if (seatFound) break;
         }
      }
      
      if (!seatFound) {
         System.out.println("Sorry, all seats in that class are reserved. Please choose another class.");
         return;
      }
      
      seats[row][col] = 1;
      System.out.printf("Seat reserved. Row: %d, Column: %d\n", row+1, col+1);
   }
}



