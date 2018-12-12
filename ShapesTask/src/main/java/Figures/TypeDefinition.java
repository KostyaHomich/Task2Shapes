package Figures;

import org.apache.log4j.Logger;

public class TypeDefinition {
    private static boolean bool;
    private static String type;
    private static Logger log = Logger.getLogger(TypeDefinition.class.getName());


    public static void setBool(boolean bool) {
        TypeDefinition.bool = bool;
    }

    public static String definitionOfType(Point[] points, Side[] sides) {
        try {
            if (bool == true) {//проверка на куб
                if (points[0].getX() == points[1].getX() &&
                        points[2].getX() == points[3].getX() &&
                        points[1].getY() == points[2].getY() &&
                        points[3].getY() == points[0].getY() &&
                        sides[0].getLength() == sides[1].getLength() &&
                        sides[1].getLength() == sides[2].getLength() &&
                        sides[2].getLength() == sides[3].getLength()) {
                    type = "Cube";
                    return "Cube";
                } else if (points[0].getY() == points[3].getY() &&
                        points[1].getY() == points[2].getY())//проверка на трапецию
                {
                    type = "Trapezium";
                    return "Trapezium";
                } else if (points[0].getY() == points[2].getY() &&
                        points[1].getX() == points[3].getX())//проверка на ромб
                {
                    type = "Rhombus";
                    return "Rhombus";
                } else if (points.length == 1)//проверка на точку
                {
                    type = "Point";
                    return "Point";
                } else {//проверка на выпуклую трапецию
                    type = "FatTrapezium";
                    return "FatTrapezium";
                }
            }
        } catch (Exception e) {
            log.info("Type are not found");
        }
        return type;

    }

    public static String getType() {
        return type;
    }

}
