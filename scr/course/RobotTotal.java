package course;

public class RobotTotal extends Robot {
    private double totalDistance = 0;

    public RobotTotal(double x, double y, double course) {
        super(x, y, course);
    }

    @Override
    public void forward(int distance) {
        super.forward(distance);
        totalDistance += distance;
        System.out.println("RobotTotal");
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}
