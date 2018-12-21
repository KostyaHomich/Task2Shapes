package entity;

import org.apache.log4j.Logger;


public class Point implements Comparable<Point> {
    private static final Logger log = Logger.getLogger(Point.class.getName());
    private int id;
    private float x, y;

    public Point(int id, float x, float y) {
        this.x = x;
        this.y = y;
        this.id = id;

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


    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    public int hashCode() {
        return 76 + 133 * id;
    }

    @Override
    public int compareTo(Point o) {
        return Integer.compare(this.id, o.id);
    }

    public int comareY(Point o) {
        return Float.compare(this.getY(), o.getY());
    }

    public int comareX(Point o) {
        return Float.compare(this.getX(), o.getX());
    }

}
