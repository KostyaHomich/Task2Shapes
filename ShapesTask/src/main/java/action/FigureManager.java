package action;

import entity.Figure;
import entity.Point;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class FigureManager{

    private static final Logger log = Logger.getLogger(FigureManager.class.getName());


    public  static float square(List<Point> points) {

        if (points.size() == 4) {
            try {
                float d1 = Math.abs(SideManager.calculateSide(points.get(0), points.get(1)));
                float d2 = Math.abs(SideManager.calculateSide(points.get(2), points.get(3)));
                return d1 * d2;

            } catch (Exception e) {

                log.error(Arrays.toString(e.getStackTrace()));
            }
        }
        return 0;

    }
    public static float perimeter(List<Point> points) {
        if (points.size() == 4) {
            try {
                float d1 = Math.abs(SideManager.calculateSide(points.get(0), points.get(1)));
                float d2 = Math.abs(SideManager.calculateSide(points.get(2), points.get(3)));
                return d1 + d2;
            } catch (Exception e) {
                log.error(Arrays.toString(e.getStackTrace()));
            }
        }
        return 0;

    }

}
