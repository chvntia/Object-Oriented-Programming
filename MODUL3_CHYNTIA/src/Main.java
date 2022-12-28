import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static boolean repeat = true;
    
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        Calculation c = new Calculation();
        Thread t = new Thread(c);

        do {
            try {
                System.out.println("\n==Menu Program==\n"
                        + "1. Square\n"
                        + "2. Circle\n"
                        + "3. Trapezoid");
                System.out.print("Select menu : ");
                int option = sc.nextInt();
                
                switch (option) {
                    case 1:
                        System.out.print("\nEnter the length of the side of the square : ");
                        c.setSide(sc.nextDouble());
                        
                        c.setSquare();
                        t.start();
                        t.join();
                        break;
                        
                    case 2:
                        System.out.print("\nEnter the radius of the circle : ");
                        c.setRadius(sc.nextDouble());
                        
                        c.setCircle();
                        t.start();
                        t.join();
                        break;
                        
                    case 3:
                        System.out.print("\nInsert the side of the base of the trapezoid : ");
                        double a = sc.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double b = sc.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double h = sc.nextDouble();
                        
                        c.setTrapezoid(a, b, h);
                        t.start();
                        t.join();
                        break;
                        
                    default:
                        System.out.println("\nOptions not available");
                        continue;
                }
                
                if (option == 1 || option == 2 | option == 3) {
                    System.out.println("\nThe calculation result: " + c.getArea());
                }
                
            } catch (InputMismatchException e) {
                System.out.println("\n====Error: Input must be a number====");
                sc.next();
            } catch (IllegalArgumentException e) {
                System.out.println("\njava.lang.IllegalArgumentException");
            }
        } while (repeat);
        
        sc.close();
    }
} 
