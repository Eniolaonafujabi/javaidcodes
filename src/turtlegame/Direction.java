package turtlegame;

public enum Direction {
    West("North","South"),
    South("West","East"),
    North("East","West"),
    East("South","North");
    private String right;
    private String left;
    private Direction(String right, String left) {
        this.right = right;
        this.left = left;
    }
        public Direction turnRight() {
        return valueOf(right);
        }
        public Direction turnLeft() {
        return valueOf(left);
        }
}

