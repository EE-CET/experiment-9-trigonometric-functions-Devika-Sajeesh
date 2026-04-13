import java.util.Scanner;

public class Trigonometry {

    public static double sine(double angle) {
        double radians = Math.toRadians(angle);
        return Math.sin(radians);
    }

    public static double cosine(double angle) {
        double radians = Math.toRadians(angle);
        return Math.cos(radians);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        sc.close();

        System.out.println("Sine: " + sine(angle));
        System.out.println("Cosine: " + cosine(angle));
    }
}
