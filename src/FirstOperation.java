import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.exists;
import static java.nio.file.Files.readAllLines;

public class FirstOperation {
    private Scanner scanner = new Scanner(System.in);

    public List<String> chooseTheFile(){
        System.out.println("Введіть шлях до файлу для считування: ");
        String filePath = scanner.nextLine();
        Path path = Path.of(filePath);
        try {
            if (exists(path)) {
                List<String> list = readAllLines(path);
                return list;
            }
        } catch (FileNotFoundException e){
            System.out.println("Cannot find file" + e);
        } catch (Exception e) {
        System.out.println("Oh, you have to a Big one. So, do something!" + e);
        }
        return null;
    }

    public int chooseTheStep(){
        System.out.print("Введіть крок сдвигу: ");
        int numb = scanner.nextInt();
        return numb;
    }
}
