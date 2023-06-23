import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class Encoding {

    public Encoding(String list, int number){
        char[] copyOfList = list.toCharArray();
        Path path = Path.of("d://result.txt");
        if(number == 3){
            try {
                Files.writeString(path," * ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if (number == 5) {
            try {
                Files.writeString(path," ** ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (number == 7) {
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
        for (char c : copyOfList) {
          // (char)(c + number);
            try {
                Files.writeString(path, String.valueOf((char)(c + number)), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
