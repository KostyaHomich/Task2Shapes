package Figures;

public class Point extends Figure {
    private int id;
    private float x, y;

    public Point() {
        x = 0f;
        y = 0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public boolean equals(Point point) {

        if (this.getX() == point.getX() && this.getY() == point.getY() ) {
            return true;
        } else return false;
    }

    public String toString() {
        return "(" + x + "," + y+")";
    }
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }
    public int hashCode()
    {
        return 76+133*id;
    }
}
