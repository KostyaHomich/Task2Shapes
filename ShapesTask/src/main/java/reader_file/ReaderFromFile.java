package reader_file;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReaderFromFile {

    private static Logger log = Logger.getLogger(ReaderFromFile.class.getName());
    private String stroke;

    public String readFromFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            File file = new File(path);
            String currentLine;
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                while ((currentLine = br.readLine()) != null) {
                    stringBuilder.append(currentLine);
                    stroke = stringBuilder.toString();
                }
            }
        } catch (Exception e) {
            log.error(e.getStackTrace());
        }
        return stroke;
    }
}
