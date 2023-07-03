package api.crypting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SecretKey {
    protected int firstKeyForStep = 3;
    protected int secondKeyForStep = 5;
    protected int thirdKeyForStep = 7;
    protected Path path = new FileAndKeyForCrypt().PathToFile();

    public SecretKey(){

    }
    public SecretKey(int keyForCrypt){
        if(keyForCrypt == firstKeyForStep){
            try {
                Files.writeString(path," * ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if (keyForCrypt == secondKeyForStep) {
            try {
                Files.writeString(path," ** ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (keyForCrypt == thirdKeyForStep) {
            try {
                Files.writeString(path," *** ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            try {
                Files.writeString(path," %% ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
