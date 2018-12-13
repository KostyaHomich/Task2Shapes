package Figures;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void validateStrokeFromFile() {
        ReaderFromFile readerFromFile = new ReaderFromFile();
        readerFromFile.readFromFile();
        String expected ="2 2 1 4 4 4 4 1";

        Validator validator=new Validator();
        validator.validateStrokeFromFile(expected);
        Assert.assertEquals(true,validator.getBool());
    }
}