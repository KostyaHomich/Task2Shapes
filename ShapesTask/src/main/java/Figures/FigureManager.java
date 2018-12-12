package Figures;



import org.apache.log4j.Logger;


public class FigureManager implements SquareFigure {

    private float square;
    private static Logger log = Logger.getLogger(SquareFigure.class.getName());

    @Override
    public float squareCubeOrRectangle(Point[] points) {
        try {
            square = (Side.calculationSide(points[0].getX(), points[1].getX(), points[0].getY(), points[1].getY())
                    *
                    Side.calculationSide(points[1].getX(), points[2].getX(), points[1].getY(), points[2].getY()));
        } catch (Exception e) {
            log.error(e.getStackTrace().toString());

        }

        return Math.abs(square);
    }

    @Override
    public float squareFatManager(Point[] points) {
        float d1, d2;
        try {
            d1 = Side.calculationSide(points[1].getX(), points[3].getX(), points[1].getY(), points[3].getY());
            d2 = Side.calculationSide(points[0].getX(), points[2].getX(), points[0].getY(), points[2].getY());
            d1 = Math.abs(d1);
            d2 = Math.abs(d2);
            square = (d1 * d2) / 2 * 0.4f;
        } catch (Exception e) {
            log.error(e.getStackTrace().toString());
        }

        return square;
    }

    @Override
    public float squareRhombus(Point[] points) {
        float d1, d2;
        try {

            d1 = Side.calculationSide(points[1].getX(), points[3].getX(), points[1].getY(), points[3].getY());
            d2 = Side.calculationSide(points[0].getX(), points[2].getX(), points[0].getY(), points[2].getY());
            d1 = Math.abs(d1);
            d2 = Math.abs(d2);
            square = (d1 * d2) / 2;
        } catch (Exception e) {
            log.error(e.getStackTrace());
        }
        return Math.abs(square);
    }

    @Override
    public float squareTrapezium(Point[] points) {
        try {
            float height = points[1].getY() - points[0].getY();
            height = Math.abs(height);
            float a = Side.calculationSide(points[1].getX(), points[2].getX(), points[1].getY(), points[2].getY());
            float b = Side.calculationSide(points[0].getX(), points[3].getX(), points[0].getY(), points[3].getY());
            a = Math.abs(a);
            b = Math.abs(b);
            square = ((a + b) / 2) * height;
        } catch (Exception e) {
            log.error(e.getStackTrace());
        }
        return square;
    }
}
