package api.crypting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class Encoding {
    protected Scanner scanner = new Scanner(System.in);
    protected String choosePathToFile = "Write the path to file for write result: ";
    public Encoding() {
    }

    public Encoding(String textForCrypt, int keyForCrypt){
        char[] copyOfList = textForCrypt.toCharArray();
        System.out.print(choosePathToFile);
        String pathToFile = scanner.nextLine();
        Path path = Path.of(pathToFile);
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
