package validator;

import org.apache.log4j.Logger;

public class FileValidator {
    public static final FileValidator fileValidator = new FileValidator();
    private static Logger log = Logger.getLogger(FileValidator.class.getName());
    private boolean bool;

    private FileValidator() {
    }

    public boolean validateStrokeFromFile(String string) {
        String[] massOfString = string.split(" ");
        if (massOfString.length == 2 || massOfString.length == 8) {
            bool = true;
            return true;
        } else {
            log.info("Its not point or a rectangle");
            bool = false;
            return false;
        }
    }

}
