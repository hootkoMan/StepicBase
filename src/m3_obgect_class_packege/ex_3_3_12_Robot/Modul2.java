package m3_obgect_class_packege.ex_3_3_12_Robot;


public class Modul2 {
    public static void main(String[] args) {
        Robot robot = new Robot(0, -5, Direction.RIGHT);
        moveRobot(robot, 0, 5);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
        int distanceX = robot.getX() - toX;
        int distanceY = robot.getY() - toY;

        if (robot.getX() > toX) {
            robot.turnLeft();
            moveForward(robot, distanceX);
        } else if (robot.getX() < toX) {
            robot.turnRight();
            moveForward(robot, distanceX);
        } else {}

        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        if (robot.getY() > toY) {
            robot.turnRight();
            moveForward(robot, distanceY);
        } else if (robot.getY() < toY) {
            robot.turnLeft();
            moveForward(robot, distanceY);
        } else {}
    }

    public static void moveForward(Robot robot, int steps) {
        steps = Math.abs(steps);
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }

}
