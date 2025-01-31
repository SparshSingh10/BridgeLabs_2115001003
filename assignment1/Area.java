public class Area {

    private int radius;
    private double area;
    private double cir;

    public Area() {
        System.out.println("Empty constructor");
    }

    public Area(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public double getCir() {
        return cir;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setcir(double cir) {
        this.cir = cir;
    }

    public void calculate() {
        this.area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
    }

    public void circum() {
        this.cir = 2 * Math.PI * this.radius;
        System.out.println(radius);
    }

    public static void main(String[] args) {
        Area a1 = new Area(3);
        a1.calculate();
        a1.circum();
        System.out.println("Area of a2: " + a1.getArea());
        System.out.println("Circumference of a2: " + a1.getCir());

    }
}