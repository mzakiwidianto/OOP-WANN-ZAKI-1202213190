import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        Calculation calculation = new Calculation();
        int menu;

        do {
            System.out.println("==Menu Program==\n1. Square\n2. Circle\n3. Trapezoid\n0. Finish");
            try {
                System.out.print("Select menu : ");
                menu = input.nextInt();
                switch (menu) {
                    case 1:
                        System.out.print("Enter the length of side of the square : ");
                        double side = input.nextDouble();
                        calculation.setSquare(side);
                        calculation.run();
                        System.out.println("The calculation result : " + calculation.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double radius = input.nextDouble();
                        calculation.setCircle(radius);
                        calculation.run();
                        System.out.println("The calculation result : " + calculation.getCircle());
                        break;
                    case 3:
                        System.out.print("Insert the side of the base of the trapezoid : ");
                        double a = input.nextDouble();
                        System.out.println("Enter the upper side of the trapezoid : ");
                        double b = input.nextDouble();
                        System.out.println("Enter the height of the trapezoid : ");
                        double t = input.nextDouble();
                        calculation.setTrapezoid(a, b, t);
                        calculation.run();
                        System.out.println("The calculation result : " + calculation.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("Program has ended.");
                        break;
                    default:
                        System.out.println("Option not available");
                        continue;
                }
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("===EROR : INPUT MUST BE A NUMBER===");
                input.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (repeat);
        input.close();
    }
}