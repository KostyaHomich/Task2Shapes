package entity;

import action.FigureManager;
import org.apache.log4j.Logger;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Rectangle extends Figure implements Comparator<Rectangle>, Comparable<Rectangle> {

    private static Logger log = Logger.getLogger(Point.class.getName());
    private List<Point> points;
    private float square;
    private float perimeter;


    public Rectangle(List<Point> points, int id) {
        this.points = points;
        this.id = id;

    }

    @Override
    public void refactorPerimeterAndSquare() {
        perimeter= FigureManager.perimeter(this.points);
        square = FigureManager.square(this.getPoints());
    }




    //get
    public List<Point> getPoints() {
        return points;
    }
    @Override
    public float getPerimeter() {
        return perimeter;
    }
    @Override
    public float getSquare() {
        return square;
    }
    //set
    public void setPoints(List<Point> points) {
        this.points = points;
        refactorPerimeterAndSquare();
    }

    //compare
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        return Float.compare(o2.getSquare(), o1.getSquare());
    }
    @Override
    public int compareTo(Rectangle o) {
        return Float.compare(o.getSquare(), this.getSquare());
    }
    public int compareId(Rectangle o) {
        return Integer.compare(this.id, o.id);

    }
    public int comparePerimetor(Rectangle o) {
        return Float.compare(this.getPerimeter(), o.getPerimeter());

    }


    //object methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Rectangle that = (Rectangle) o;
        return Objects.equals(getPoints(), that.getPoints());
    }
    @Override
    public int hashCode() {
        List<Point> points = getPoints();
        return Objects.hash(points.get(0)) + Objects.hash(points.get(1)) + Objects.hash(points.get(2)) + Objects.hash(points.get(3));
    }
    @Override
    public String toString() {
        return "\nSquare = " + square + "  \nPerimeter = " + perimeter;

    }

}
