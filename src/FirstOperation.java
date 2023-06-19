import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Files.exists;
import static java.nio.file.Files.readAllLines;

public class FirstOperation extends Constants{

    public List<String> ChooseTheFile(){
        System.out.println("Введіть шлях до файлу: ");
        String filePath = scanner.nextLine();
        Path path = Path.of(filePath);
        try {
            if (exists(Path.of(filePath))) {
                List<String> list = readAllLines(Path.of(filePath));
                return list;
            }
        } catch (FileNotFoundException e){
            System.out.println("Cannot find file" + e);
        } catch (Exception e) {
        System.out.println("Oh, you have to a Big one. So, do something!" + e);
        }
        return null;
    }

    public int ChooseTheStep(){
        System.out.print("Введіть крок сдвигу: ");
        int numb = scanner.nextInt();
        return numb;
    }
}
