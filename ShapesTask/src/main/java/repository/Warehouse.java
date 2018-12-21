package repository;

import entity.Figure;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Warehouse implements WarehouseFigures {

    private static final Logger log = Logger.getLogger(Warehouse.class.getName());

    private Map<Integer, Figure> mapFigures = new HashMap<>();
    private Map<Integer, Float> mapPerimeter = new HashMap<>();
    private Map<Integer, Float> mapSquare = new HashMap<>();


    @Override
    public String toString() {
        return "Amount of figures = " + mapFigures.size();
    }

    @Override
    public void addFigure(int key, Figure figure) {
        if (!mapFigures.containsKey(key)) {
            mapFigures.put(key, figure);
            mapPerimeter.put(key, figure.getPerimeter());
            mapSquare.put(key, figure.getSquare());

        } else {
            log.info("Key is already exist");
        }
    }

    @Override
    public void removeFigure(int key) {
        if (mapFigures.containsKey(key)) {

            mapFigures.remove(key);
            mapPerimeter.remove(key);
            mapSquare.remove(key);

        } else {
            log.info("Figure is not exist");
        }

    }

    @Override
    public void replaceFigure(int key, Figure figure) {

        if (mapFigures.containsKey(key)) {

            mapFigures.replace(key, figure);
            mapPerimeter.replace(key, figure.getPerimeter());
            mapSquare.remove(key, figure.getSquare());

        } else {
            log.info("Key is not exist");
        }

    }

    public Figure getFigure(int key) {
        return mapFigures.get(key);
    }

    public Map<Integer, Figure> getMapFigures() {
        return mapFigures;
    }

    public Map<Integer, Float> getMapSquare() {
        return mapSquare;
    }

    public Map<Integer, Float> getMapPerimeter() {
        return mapPerimeter;
    }


}
