package action;

import entity.Figure;

public interface ObserverFigure {
     void addObserver(Figure figure);
     void removeObserver(Figure figure);
     void notifyObservers();
}
