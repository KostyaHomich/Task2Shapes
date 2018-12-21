package validator;

import junit.framework.Assert;
import org.junit.Test;

public class FileValidatorTest {

    @Test
    public void validateStrokeFromFile() {
        boolean bool=FileValidator.fileValidator.validateStrokeFromFile("1 1 1 4 4 4 4 1 2");
        Assert.assertEquals(false,bool);
    }

    @Test
    public void validateStrokeFromFile2() {
        boolean bool=FileValidator.fileValidator.validateStrokeFromFile("1 1");
        Assert.assertEquals(true,bool);
    }
}