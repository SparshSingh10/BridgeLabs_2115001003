public class Circle {
    private int radius;

    // Default constructor
    public Circle() {
        this(10);
        System.out.println("Default Constructor called");
    }

    // Parameterized constructor
    public Circle(int radius) {
        this.radius = radius;
        System.out.println("Parameterized Constructor called " + radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
