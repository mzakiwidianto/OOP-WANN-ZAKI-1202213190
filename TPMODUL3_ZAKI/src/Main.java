import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int customerID;
        int orderQty;
        Scanner scan = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        try {
            System.out.print("Enter Customer ID: ");
            customerID = scan.nextInt();

            System.out.print("Enter how much food to made: ");
            orderQty = scan.nextInt();
            scan.close();

            Waiters waiter = new Waiters(orderQty, customerID);
            Thread thread1 = new Thread(restaurant);
            Thread thread2 = new Thread(waiter);

            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
        } catch (Exception err) {
            System.out.println("Input must be Integer");
        }
    }
}
