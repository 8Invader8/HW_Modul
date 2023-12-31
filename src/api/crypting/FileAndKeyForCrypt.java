package api.crypting;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.exists;
import static java.nio.file.Files.readAllLines;

public class FileAndKeyForCrypt {
    protected Scanner scanner = new Scanner(System.in);
    List<String> emptyList;

    public List<String> chooseTheFile(){
        System.out.print("Write the path to file: ");
        String filePath = scanner.nextLine();
        Path path = Path.of(filePath);
        try {
            if (exists(path)) {
                return readAllLines(path);
            }
        } catch (FileNotFoundException e){
            System.out.println("Cannot find file" + e);
        } catch (Exception e) {
        System.out.println("Oh, you have to a Big one. So, do something!" + e);
        }
        return emptyList;
    }

    public int chooseTheKey(){
        System.out.print("Write the key for crypt: ");
        return scanner.nextInt();
    }
}
