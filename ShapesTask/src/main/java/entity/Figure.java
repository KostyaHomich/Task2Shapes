package entity;

import java.util.List;

public abstract class Figure {

    public int id;

    public abstract void refactorPerimeterAndSquare();

    public abstract float getPerimeter();

    public abstract float getSquare();

    public abstract List<Point> getPoints();


}
