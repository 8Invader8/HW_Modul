import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

import static java.nio.file.Files.writeString;

public class Decoding {
//    public static final String LANGUAGECODE = "абвгґдеєжзиіїйклмнопрстуфхцчшщьюя.,\"\":-!? ";
    public static final String LANGUAGECODE = "abcdefghijklmnopqrstuvwxyz .,\"\":-!?";
    public  Decoding(String code, int numb){
        char[] result = code.toCharArray();
        Path path = Path.of("d://result.txt");
        String str = "";
        for(int i = 0; i < result.length;i++){
            for(int j = 0; j < LANGUAGECODE.length(); j++) {
                if (code.charAt(i) == LANGUAGECODE.charAt(j)) {
                    if(j == 0) {
                        j = LANGUAGECODE.length() - 1;
                        result[i] = LANGUAGECODE.charAt(j - numb);
                        j = 0;
                    }else if(j == LANGUAGECODE.length() - 1){
                        j = 1;
                        result[i] = LANGUAGECODE.charAt(j - numb);
                        j = LANGUAGECODE.length() - 1;
                    }else {
                        result[i] = LANGUAGECODE.charAt(j - numb);
                    }
                }
            }
        }
        str = String.valueOf(result);
        try {
            writeString(path, str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public Decoding() {
    }
}
