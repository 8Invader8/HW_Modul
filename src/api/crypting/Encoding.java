package api.crypting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;



public class Encoding {

    protected  Path path = new FileAndKeyForCrypt().PathToFile();
    public Encoding() {
    }

    public Encoding(String textForCrypt, int keyForCrypt){
        char[] copyOfList = textForCrypt.toCharArray();
        new SecretKey(keyForCrypt);

        for (char c : copyOfList) {
            try {
                Files.writeString(path, String.valueOf((char)(c + keyForCrypt)), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
