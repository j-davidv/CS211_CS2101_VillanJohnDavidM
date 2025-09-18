import java.util.Scanner;
class PartyCone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Diameter of the cone's base: ");
        double diameter = scanner.nextDouble();

        System.out.print("Height of the cone: ");
        double height = scanner.nextDouble();

        double radius = diameter / 2.0;

        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;

        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        double surfaceArea = Math.PI * radius * (radius + slantHeight);

        System.out.printf("Surface Area is %.4f%n", surfaceArea);
        System.out.printf("Volume is %.4f%n", volume);

        scanner.close();
    }
}