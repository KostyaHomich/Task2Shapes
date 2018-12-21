package action;

import entity.Figure;
import entity.Point;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class FigureManager{

    private static final Logger log = Logger.getLogger(FigureManager.class.getName());


    public  static float square(List<Point> points) {
        float square=0;

        if (points.size() == 4) {
            try {
                float d1 = Math.abs(SideManager.calculateSide(points.get(0), points.get(1)));
                float d2 = Math.abs(SideManager.calculateSide(points.get(2), points.get(3)));
                square = d1 * d2;

            } catch (Exception e) {
                log.error(Arrays.toString(e.getStackTrace()));
            }
        } else {
            square = 0;

        }
        return square;


    }
    public static float perimeter(List<Point> points) {
        float perimeter=0;
        if (points.size() == 4) {
            try {
                float d1 = Math.abs(SideManager.calculateSide(points.get(0), points.get(1)));
                float d2 = Math.abs(SideManager.calculateSide(points.get(2), points.get(3)));
                perimeter = d1 + d2;
            } catch (Exception e) {
                log.error(Arrays.toString(e.getStackTrace()));
            }
        } else {
            perimeter = 0;
        }
        return perimeter;

    }

}
