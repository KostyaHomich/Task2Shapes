package entity;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class RectangleTest {
    List<Rectangle> list=new ArrayList<>();

    public void show()
    {
        for (Rectangle rectangle:list) {
System.out.println(rectangle.id);
        }
    }
    @Test
    public void compare() {
        List<Point> list2 = new ArrayList<>();
        list2.add(new Point(1, 1, 1));
        list2.add(new Point(2, 1, 4));
        list2.add(new Point(3, 4, 4));
        list2.add(new Point(4, 4, 1));
        for (int i = 40; i > 0; i--) {
            list2.add(new Point(i, i, i++));
        }

        list.add(new Rectangle(list2, 1));
        list.sort(Rectangle::compareId);
        show();

    }
}