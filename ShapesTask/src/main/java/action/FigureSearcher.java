package action;

import entity.Figure;
import org.apache.log4j.Logger;

import java.util.*;

public class FigureSearcher {

    private Map<Integer, Figure> mapFigures = new HashMap<>();
    private static final Logger log = Logger.getLogger(FigureSearcher.class.getName());

    public Collection<Figure> getMapFiguresByPerimeter(float minPerimeter,float maxPerimeter) {
        Collection<Figure> figureMapByPerimeter = mapFigures.values();
        if(minPerimeter>=maxPerimeter)
        {
            log.info("minValue cant more then maxValue");
        }
        else {


            for (Figure figure : figureMapByPerimeter) {
                if (figure.getPerimeter() < minPerimeter && figure.getPerimeter() > maxPerimeter) {
                    figureMapByPerimeter.remove(figure);
                }
            }
        }
        return figureMapByPerimeter;
    }
    public Collection<Figure> getMapFiguresBySquare(float minSquare,float maxSquare) {
        Collection<Figure> figureMapBySquare = mapFigures.values();
        if(minSquare>=maxSquare)
        {
            log.info("minSquare cant more then maxSquare");
        }
        else {
            for (Figure figure : figureMapBySquare) {
                if (figure.getSquare() < minSquare && figure.getSquare() > maxSquare) {
                    figureMapBySquare.remove(figure);
                }
            }
        }
        return figureMapBySquare;

    }
    public Collection<Figure> getMapFiguresById(float minId,float maxId)
    {
        Collection<Figure> figureMapById = mapFigures.values();
        if(minId>=maxId)
        {
            log.info("minValue cant more then maxValue");
        }
        else {
            for (Figure figure : figureMapById) {
                if (figure.id < minId && figure.id > maxId) {
                    figureMapById.remove(figure);
                }
            }
        }
        return figureMapById;
    }
    private void setMapFigures(Map<Integer, Figure> mapFigures) {
        this.mapFigures = mapFigures;
    }
}
