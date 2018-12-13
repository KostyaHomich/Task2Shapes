package Figures;

import org.apache.log4j.Logger;
import org.junit.Assert;

public class Validator {
    private boolean bool;
    private static Logger log = Logger.getLogger(Validator.class.getName());

    public Validator()
    {
        bool=false;

    }


    public boolean validateStrokeFromFile(String string) {
        String[] massOfString = string.split(" ");
        switch (massOfString.length) {
            case 2:
                 bool=true;break;
            case 8:
                 bool=true;break;
            default:
                log.info("Its not point or a rectangle");
                bool=false;break;
        }
        return bool;


    }


    public boolean getBool() {
        return  bool;
    }


}
