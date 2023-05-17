import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double x;
        double y;
        double z;

        System.out.println("What is the opposite sides length? ");
        x = scanner.nextDouble();
        System.out.println("What is the adjacent sides length? ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse of the right triangle is: " + z);

        scanner.close();

    }
}
