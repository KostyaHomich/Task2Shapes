package Figures;

import reader_file.ReaderFromFile;
import org.junit.Assert;
import org.junit.Test;

public class ReaderFromFileTest {

    @Test
    public void readFromFileTrue() {
        ReaderFromFile readerFromFile = new ReaderFromFile();
        String expected = readerFromFile.readFromFile("Coordinates.txt");
        String actual = "1 1 1 4 4 4 4 1";
        boolean bool=expected.contentEquals(actual);
        Assert.assertEquals(true, bool);

    }

    @Test
    public void readFromFileFalse() {
        ReaderFromFile readerFromFile = new ReaderFromFile();
        String expected =readerFromFile.readFromFile("Coordinates.txt");
        String actual = "2 2 1 4 4 4 4 1";
        boolean bool=expected.contentEquals(actual);
        Assert.assertEquals(false, bool);

    }
}