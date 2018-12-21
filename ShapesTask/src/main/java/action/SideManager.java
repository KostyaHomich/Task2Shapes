package action;

import entity.Point;
import org.apache.log4j.Logger;

public class SideManager {
    public final static SideManager sideManager = new SideManager();
    private static Logger log = Logger.getLogger(SideManager.class.getName());

    public static float calculateSide(Point point1, Point point2) {
        float length = 0;
        try {
            length = (float) Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
        } catch (Exception e) {
            log.error(e.getStackTrace());
        }
        return length;
    }


}
