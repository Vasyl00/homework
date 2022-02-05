package course;

import javax.swing.*;
import java.awt.*;

public class RobotFrame extends JFrame {
    public RobotFrame(Robot robot) {
        setTitle("Robot Frame");
        add(new RobotPathComponent(robot));
        setBounds(100, 100, 500, 500);
    }

    public RobotFrame() throws HeadlessException {
    }

    public RobotFrame(course.model.Robot robot) {
    }
}
