import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Decoding extends Encoding{

    public  Decoding(String list, int number){
        char[] copyOfList = list.toCharArray();
        System.out.print(choosePathToFile);
        String pathToFile = scanner.nextLine();
        Path path = Path.of(pathToFile);

        for (char c : copyOfList) {
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
