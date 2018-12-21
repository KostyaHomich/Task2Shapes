package repository;

import entity.Figure;

public interface WarehouseFigures {
    void addFigure(int key, Figure figure);

    void removeFigure(int key);

    void replaceFigure(int key, Figure figure);
}
