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

    public SecretKey(){

    }
    public SecretKey(int keyForCrypt){
        if(keyForCrypt == firstKeyForStep){
            try {
                Files.writeString(Path.of(scanner.nextLine())," * ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if (keyForCrypt == secondKeyForStep) {
            try {
                Files.writeString(Path.of(scanner.nextLine())," ** ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (keyForCrypt == thirdKeyForStep) {
            try {
                Files.writeString(Path.of(scanner.nextLine())," *** ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            try {
                Files.writeString(Path.of(scanner.nextLine())," %% ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
