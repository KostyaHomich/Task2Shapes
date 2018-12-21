package action;

import org.junit.Assert;
import org.junit.Test;
import reader_file.ReaderFromFile;



public class FigureManagerTest {


    private ReaderFromFile readerFromFile = new ReaderFromFile();

    private PointCreator pointCreator =new PointCreator();


    @Test
    public void square() {

        String expected = readerFromFile.readFromFile("Coordinates.txt");
        PointCreator pointCreator =new PointCreator();
        pointCreator.createPoints(expected);


        float square=FigureManager.square(pointCreator.getPoints());
        Assert.assertEquals((float)9,square,1);
    }
    @Test
    public void square2() {

        PointCreator pointCreator =new PointCreator();
        pointCreator.createPoints("1 1 1 5 5 5 5 1");
        float square= FigureManager.square(pointCreator.getPoints());
        Assert.assertEquals((float)16,square,1);
    }
    @Test
    public void perimeter()
    {

        String expected = readerFromFile.readFromFile("Coordinates.txt");

        pointCreator.createPoints(expected);

        float perimeter= FigureManager.perimeter(pointCreator.getPoints());
        Assert.assertEquals((float)6,perimeter,1);
    }
}