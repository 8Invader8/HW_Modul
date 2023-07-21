package api.crypting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SecretKey {
    protected int firstKeyForStep = 3;
    protected int secondKeyForStep = 5;
    protected int thirdKeyForStep = 7;
    protected Scanner scanner = new Scanner(System.in);

    public SecretKey() {

    }
    public SecretKey(String pathToFile,Integer keyForCrypt){

        if(keyForCrypt.equals(firstKeyForStep)) {
            try {
                Files.writeString(Path.of(pathToFile)," * ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (keyForCrypt.equals(secondKeyForStep)) {
            try {
                Files.writeString(Path.of(pathToFile)," ** ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (keyForCrypt.equals(thirdKeyForStep)) {
            try {
                Files.writeString(Path.of(pathToFile)," *** ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            try {
                Files.writeString(Path.of(pathToFile)," %% ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
