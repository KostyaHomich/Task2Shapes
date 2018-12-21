package action;

import entity.Figure;

public interface ObserverFigureInt {
     void addObserver(Figure figure);
     void removeObserver(Figure figure);
     void notifyObservers();
}
