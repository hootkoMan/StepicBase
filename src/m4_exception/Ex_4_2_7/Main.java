package m4_exception.Ex_4_2_7;

public class Main {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean robotMoved = false;

        for (int i = 0; i < 3; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                robotMoved = true;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw e;
                }
            }
            if (robotMoved) {
                return;
            }
        }

    }
}
