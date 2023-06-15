import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

import static java.nio.file.Files.writeString;

public class Encoding {

    public static final String LANGUAGECODE = "абвгґдеєжзиіїйклмнопрстуфхцчшщьюя .,\":-!?";
    public Encoding(String code,int numb){
        char[] result = code.toCharArray();
        Path path = Path.of("d://result.txt");
        String str = "";
        for(int i = 0; i < result.length;i++){
            for(int j = 0; j < LANGUAGECODE.length(); j++) {
                if (Character.toLowerCase(code.charAt(i)) == LANGUAGECODE.charAt(j)){
                    if(j == LANGUAGECODE.length() - 1){
                        j = 0;
                        result[i] = LANGUAGECODE.charAt(j + numb-1);
                        j = LANGUAGECODE.length() - 1;
                    }else if(j + numb > LANGUAGECODE.length()){
                        int count = j + numb - LANGUAGECODE.length() ;
                        result[i] = LANGUAGECODE.charAt(count);
                    }else {
                        result[i] = LANGUAGECODE.charAt(j + numb);
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

    public Encoding() {
    }
}
