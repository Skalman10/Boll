package Shapes;

public class Circle extends Shape{
    private Point p1;
    private int radius;

    public Circle(Point p1, int r) {
        this.p1 = p1;
        this.radius = r;
    }

    public Point getCenter() {
        return p1;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

}