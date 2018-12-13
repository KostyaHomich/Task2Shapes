package Figures;

import org.apache.log4j.Logger;

public class TypeDefinition {
    private  boolean bool;
    private  String type;
    private  Logger log = Logger.getLogger(TypeDefinition.class.getName());


    public  void setBool(boolean bool) {
        this.bool = bool;
    }

    public  void definitionOfType(String string) {
        String[] massOfString = string.split(" ");
        try {
            if (bool == true) {//проверка на куб
                if ((massOfString[0] ==massOfString[2] &&
                        massOfString[2] == massOfString[4] &&
                        massOfString[4] == massOfString[6]) ||
                        (massOfString[1] ==massOfString[3] &&
                                massOfString[3] == massOfString[5] &&
                                massOfString[5] == massOfString[7]) ) {
                    type = "Cube";

                } else if (massOfString[0] ==massOfString[2] &&
                        massOfString[2] == massOfString[4])//проверка на трапецию
                {
                    type = "Trapezium";

                } else if (massOfString[1] ==massOfString[3] &&
                        massOfString[3] == massOfString[5])//проверка на ромб
                {
                    type = "Rhombus";

                } else if (massOfString.length == 2)//проверка на точку
                {
                    type = "Point";

                } else {//проверка на выпуклую трапецию
                    type = "FatTrapezium";

                }
            }
        } catch (Exception e) {
            log.info("Type are not found");
        }


    }

    public  String getType() {
        return type;
    }

}
