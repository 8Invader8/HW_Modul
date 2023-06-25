import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class Encoding {
    protected String choosePathToFile = "Введіть шлях до файлу для запису: ";
    protected Scanner  scanner = new Scanner(System.in);
    protected int firstKeyForStep = 3;
    protected int secondKeyForStep = 5;
    protected int thirdKeyForStep = 7;
    public Encoding(String list, int number){
        char[] copyOfList = list.toCharArray();
        System.out.print(choosePathToFile);
        String pathToFile = scanner.nextLine();
        Path path = Path.of(pathToFile);

        if(number == firstKeyForStep){
            try {
                Files.writeString(path," * ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if (number == secondKeyForStep) {
            try {
                Files.writeString(path," ** ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (number == thirdKeyForStep) {
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
            try {
                Files.writeString(path, String.valueOf((char)(c + number)), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Encoding() {

    }
}
