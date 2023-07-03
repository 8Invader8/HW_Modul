package api.crypting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Decoding {

    protected  Path path = new FileAndKeyForCrypt().PathToFile();
    public Decoding() {
    }

    public Decoding(String textForCrypt, int keyForCrypt){
        char[] copyOfList = textForCrypt.toCharArray();

            for (char c : copyOfList) {
                try {
                    Files.writeString(path, String.valueOf((char) (c - keyForCrypt)), StandardOpenOption.APPEND);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    }


}
