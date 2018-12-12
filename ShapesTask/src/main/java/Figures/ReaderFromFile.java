package Figures;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReaderFromFile {
    private StringBuilder stringBuilder;
    private String[] massOfString;
    private Point[] points;
    private Side[] sides;
    private Validator validator = new Validator();

    private static Logger log = Logger.getLogger(ReaderFromFile.class.getName());

    public String readFromFile() {
        stringBuilder = new StringBuilder();
        try {
            File file=new File("coordinates.txt");
            String currentLine;
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                while ((currentLine = br.readLine()) != null) {
                    stringBuilder.append(currentLine);
                    if (validator.validateStrokeFromFile(stringBuilder.toString()) && validator.validatePoints(stringBuilder.toString())) {
                        createPoints(stringBuilder.toString());
                        return stringBuilder.toString();
                    } else {
                        log.info("Figure are not created");
                        stringBuilder=null;

                    }
                }

            }
        } catch (Exception e) {
            log.error(e.getStackTrace());
        }
        return "";
    }

    public void createPoints( String string) {

        massOfString = string.split(" ");
        points = new Point[massOfString.length / 2];
        try {
            for (int i = 0; i < points.length; i++) {
                points[i].setXY(Float.parseFloat(massOfString[i * 2]), Float.parseFloat(massOfString[i * 2 + 1]));
            }
        } catch (Exception e) {
            log.info("Stroke has not valid format");
        }


    }

    public Point[] getPoints() {
        return points;
    }



}
