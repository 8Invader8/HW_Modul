import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Decoding {

    public  Decoding(String list, int number){
        char[] copyOfList = list.toCharArray();
        Path path = Path.of("d://result.txt");

        for (char c : copyOfList) {
            // (char)(c - number);
            try {
                Files.writeString(path, String.valueOf((char)(c - number)), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Decoding() {
    }
}
