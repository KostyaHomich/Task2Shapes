package action;

import entity.Point;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PointCreator {

    private static final Logger log = Logger.getLogger(Point.class.getName());
    private int id = 0;
    private List<Point> points = new ArrayList<>();

    public void createPoints(String string) {

        String[] massOfString = string.split(" ");
        id++;

        try {
            for (int i = 0; i < massOfString.length - 1; i += 2) {
                points.add(new Point(id, Float.parseFloat(massOfString[i]), Float.parseFloat(massOfString[i + 1])));
            }
        } catch (Exception e) {
            log.info("Stroke has not valid format");
        }


    }

    public List<Point> getPoints() {
        return points;
    }

}
