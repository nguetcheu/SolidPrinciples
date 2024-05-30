package SingleResponsibility;
/*
This is not a good example of single responsibility principle
 */
public class CircleBadExemple {

    private int radius; // rayon
    private Point point; // centre

    public CircleBadExemple() {
        point = new Point(0,0);
        radius = 1;
    }

    public CircleBadExemple(int x, int y, int r) {
        point = new Point(x, y);
        radius = r;
    }

    public void draw() // display circle fake method
    {
        System.out.println("the circle have radius of "+radius+ "and the center is" +point);
    }
}
