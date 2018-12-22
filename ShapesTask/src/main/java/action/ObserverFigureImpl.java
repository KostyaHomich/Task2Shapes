package action;

import entity.Figure;
import org.apache.log4j.Logger;
import repository.Warehouse;
import java.util.ArrayList;
import java.util.List;

public class ObserverFigureImpl implements ObserverFigure {


    private static final Logger log = Logger.getLogger(Warehouse.class.getName());
    private List<Figure> listObservers = new ArrayList<>();
    private Warehouse warehouse;

    public ObserverFigureImpl(Warehouse warehouse) {
        this.warehouse = warehouse;
    }


    @Override
    public void addObserver(Figure figure) {
        if (!listObservers.contains(figure.id)) {
            listObservers.add(figure);
            warehouse.addFigure(figure.id, figure);

        } else {
            log.info("This figure is already add " + figure.id);
        }

    }

    @Override
    public void removeObserver(Figure figure) {
        if (!listObservers.contains(figure)) {
            log.info("Observer is not exist");
        } else {
            listObservers.remove(figure);
            warehouse.removeFigure(figure.id);
        }
    }

    @Override
    public void notifyObservers() {
        try {

            for (Figure figure : listObservers) {
                figure.refactorPerimeterAndSquare();
                log.info(figure.getPoints().size());
                warehouse.replaceFigure(figure.id, figure);
            }
        } catch (Exception e) {
            log.info("Size "+listObservers.size());
        }

    }

}
