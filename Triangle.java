import java.util.Scanner;

/**
 * This class represents a triangle with a name, base, and height and uses the constructors to
 * create a new instance of the triangle and calculate its area.
 *
 * @author Arturo Rivera, arivera030@student.sdccd.edu
 * @version 1.0
 * @since 10/26/2025
 */

public class Triangle {
    private String name;
    private double base;
    private double height;

    /**
     * No-argument constructor.
     * Sets name to "Unknown" and base/height to 0.0.
     */
    public Triangle() {
        name = "Unknown";
        base = 0.0;
        height = 0.0;
    }

    /**
     * Constructor that sets the triangle's name, base, and height.
     * @param inName the triangle's name
     * @param inBase the triangle's base dimension
     * @param inHeight the triangle's height dimension
     */
    public Triangle(String inName, double inBase, double inHeight) {
        name = inName;
        base = inBase;
        height = inHeight;
    }

    /**
     * Sets the triangle's name.
     * @param newName the new name
     */
    public void setName(String newName) {
        name = newName;
    }
    
    /**
     * Sets the triangle's base.
     * @param newBase the new base value
     */
    public void setBase(double newBase) {
        base = newBase;
    }
    
    /**
     * Sets the triangle's height.
     * @param newHeight the new height value
     */
    public void setHeight(double newHeight) {
        height = newHeight;
    }

    /**
     * Reads triangle values from the user using the keyboard.
     */
    public void readInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the triangle's name: ");
        name = input.nextLine();

        System.out.print("What is the triangle's base: ");
        base = input.nextDouble();

        System.out.print("What is the triangle's height: ");
        height = input.nextDouble();
        input.nextLine(); // clear leftover newline
    }

    /**
     * Prints the triangle's details, including area rounded to 1 decimal place.
     */
    public void writeOutput() {
        System.out.printf("Triangle name is: %s%n", name);
        System.out.printf("Triangle base is: %.1f%n", base);
        System.out.printf("Triangle height is: %.1f%n", height);
        System.out.printf("Triangle area is: %.1f%n%n", getArea());
    }

    /**
     * Calculates the triangle's area.
     * @return the area of the triangle as a double
     */
    private double getArea() {
        return 0.5 * base * height;
    }
}