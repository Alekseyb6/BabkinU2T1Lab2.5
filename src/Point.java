public class Point {
    // instance variables
    private int x;
    private int y;

    // constructors
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int z) {
        x = z;
        y = z;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    // getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // setters
    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    // makes the x and y values into coordinate format
    public String coordinate() {
        return ("(" + x + ", " + y + ")");
    }

    // returns if the coordinate is in a specific quadrant, origin, or on an axis
    public String quadrant() {
        if (x == 0 && y == 0) {
            return ("origin");
        }
        if (x != 0 && y == 0) {
            return ("on an axis");
        }
        if (x == 0 && y != 0) {
            return ("on an axis");
        }
        if (x > 0 && y > 0) {
            return ("I");
        } else if (x < 0 && y > 0) {
            return ("II");
        } else if (x > 0 && y < 0) {
            return ("III");
        } else if (x < 0 && y < 0)  {
            return ("IV");
        }
            return null;
        }
    }