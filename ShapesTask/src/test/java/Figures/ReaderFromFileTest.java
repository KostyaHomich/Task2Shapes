package Figures;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReaderFromFileTest {

    @Test
    public void readFromFileTrue() {
        ReaderFromFile readerFromFile = new ReaderFromFile();
        String expected = readerFromFile.readFromFile();
        String actual = "1 1 1 4 4 4 4 1";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void readFromFileFalse() {
        ReaderFromFile readerFromFile = new ReaderFromFile();
        String expected = readerFromFile.readFromFile();
        String actual = "2 2 1 4 4 4 4 1";
        Assert.assertEquals(expected, actual);

    }
}