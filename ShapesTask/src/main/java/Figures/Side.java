package Figures;

import org.apache.log4j.Logger;

public class Side {
    private float length;
    private static Logger log = Logger.getLogger(Side.class.getName());


    public Side(Point firstPoint, Point secondPoint) {
        length = calculationSide(firstPoint.getX(), secondPoint.getX(), firstPoint.getY(), secondPoint.getY());
    }

    public static float calculationSide(float x1, float x2, float y1, float y2) {
        float length = 0;
        try {
            length = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        } catch (Exception e) {
            log.error(e.getStackTrace());
        }
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }

}
