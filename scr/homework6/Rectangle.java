package homework6;

public class Rectangle {
    double width;
    double length;

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }

    public Rectangle(double width, double length) {
        if (width < 0) {
            width = 0;
        }
        if (width < 0) {
            width = 0;
        }
        this.width = width;
        this.length = length;
    }

    public double getWidth() {

        return width;
    }

    public double getArea() {
        return width * length;
    }

    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            length = 0;
        }
        this.length = length;
    }
}
