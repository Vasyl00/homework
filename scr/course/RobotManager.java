package course;

import javax.swing.*;

public class RobotManager {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        Robot r2;
        r2 = new Robot();
        r1.x = 99;

        System.out.println(r1.x);
        r2.x = 123;
        System.out.println(r1.x);
        System.out.println(r2.x);

        Robot robot = new Robot();

        robot.forward(20);
        robot.printCoordinates();

        robot.course = 90;
        robot.forward(20);
        robot.printCoordinates();

        robot.course = 45;
        robot.forward(20);
        robot.printCoordinates();

        robot.setCourse(45);
        System.out.println(robot.getCourse());      // Здесь будет 45
        RobotManager rm = new RobotManager();
        rm.changeCourse(robot);

        System.out.println(robot.getCourse());

        RobotExt robotExt = new RobotExt(0, 0, 0);

        robotExt.forward(20);
        robotExt.printCoordinates();

        robotExt.setCourse(90);
        robotExt.forward(20);
        robotExt.printCoordinates();

        robotExt.setCourse(45);
        robotExt.forward(20);
        robotExt.printCoordinates();
        robotExt.back(10);
        robotExt.printCoordinates();
        System.out.println(robot.toString());
        Robot robot2 = new RobotTotal(0, 0, 0);

        robot2.forward(20);
        robot2.setCourse(90);
        robot2.forward(20);
        robot2.setCourse(90);
        robot2.forward(50);
        robot2.printCoordinates();

        final int COUNT = 12;
        final int SIDE = 100;

        Robot robot3 = new Robot(200, 50, 1);
        for (int i = 0; i < COUNT; i++) {
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse() + 360 / COUNT);
        }

        RobotFrame rf = new RobotFrame(robot);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setVisible(true);

    }

    private void changeCourse(Robot robot) {
        robot.setCourse(180);
    }
}
