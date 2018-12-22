package repository;

import action.ObserverFigureImpl;
import entity.Point;
import entity.Rectangle;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        ObserverFigureImpl observerFigureImpl =new ObserverFigureImpl(warehouse);

        observerFigureImpl.addObserver(rect1);
        observerFigureImpl.addObserver(rect2);
        observerFigureImpl.addObserver(rect3);


        System.out.println(warehouse.toString());
    }
}