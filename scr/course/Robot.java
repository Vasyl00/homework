package course;

import java.util.ArrayList;

public class Robot {
    private ArrayList<RobotLine> lines = new ArrayList<RobotLine>();

    double x = 0;
    double y = 0;
    double course = 0;

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    private Operator operator;
    void printCoordinates() {
        System.out.println(x + "," + y);
    }


    public void forward(int distance) {
        final double xOld = x;
        final double yOld = y;
        x += distance * Math.cos(course / 180 * Math.PI);
        y += distance * Math.sin(course / 180 * Math.PI);
        lines.add(new RobotLine(xOld, yOld, x, y));
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public Robot(double x, double y, double course) {
        this.x = x;
        this.y = y;
        this.course = course;
    }
    public Robot() {

    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                '}';
    }


    public ArrayList<RobotLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<RobotLine> lines) {
        this.lines = lines;
    }
}
