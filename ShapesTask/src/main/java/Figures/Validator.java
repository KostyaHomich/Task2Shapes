package Figures;

import org.apache.log4j.Logger;

public class Validator {
    private boolean bool = false;
    private static Logger log = Logger.getLogger(Validator.class.getName());


    public boolean validateStrokeFromFile(String string) {
        String[] massOfString = string.split(" ");
        switch (massOfString.length) {
            case 1:
                return bool=true;
            case 4:
                return bool=true;
            default:
                log.info("Its not point or a rectangle");
                return bool=false;
        }


    }

    public boolean validatePoints(String string) {
        String[] massOfString = string.split(" ");
        if ( massOfString.length == 4 || massOfString.length==1) {

            TypeDefinition.setBool(true);
            return bool=true;

        } else {
            TypeDefinition.setBool(false);
            return bool=false;
        }


    }

    public boolean getBool() {
        return  bool;
    }
}
