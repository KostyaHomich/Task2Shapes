package repository;

import action.ObserverFigure;
import entity.Figure;
import entity.Point;
import entity.Rectangle;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WarehouseTest {

    @Test
    public void WareHouseTest() {
        List<Point> list=new ArrayList<>();
        list.add(new Point(1,1,1));
        list.add(new Point(2,1,4));
        list.add(new Point(3,4,4));
        list.add(new Point(4,4,1));

        Rectangle rect1=new Rectangle(list,1);
        Rectangle rect2=new Rectangle(list,2);
        Rectangle rect3=new Rectangle(list,3);

        Warehouse warehouse=new Warehouse();
        ObserverFigure observerFigure=new ObserverFigure(warehouse);

        observerFigure.addObserver(rect1);
        observerFigure.addObserver(rect2);
        observerFigure.addObserver(rect3);


        System.out.println(warehouse.toString());
    }
}