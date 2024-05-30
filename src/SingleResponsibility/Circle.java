package SingleResponsibility;

/*
Good example of singleResponsibility
 */
public class Circle {

    private int radius; // rayon
    private Point point; // centre

    public Circle() {
        point = new Point(0,0);
        radius = 1;
    }

    public Circle(int x, int y, int r) {
        point = new Point(x, y);
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() { // calcul de aire
        return  Math.PI * (radius*radius);
    }

    public double getPerimeter() // calcul du perimetre
    {
        return 2 * Math.PI * radius;
    }
}
