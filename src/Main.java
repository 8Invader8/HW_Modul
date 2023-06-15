

import java.io.FileNotFoundException;
import java.nio.file.Files;

import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.*;
import static java.nio.file.Path.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть шлях жо файлу: ");
        String filePath = scanner.nextLine();
        Path path = Path.of(filePath);

        System.out.print("Виберіть шифрування(encoding) або розшифрування(decoding): ");
        String in = scanner.nextLine();
       // String path = "d://test.txt";
        System.out.print("Введіть крок сдвигу: ");
        int numb = scanner.nextInt();

        try {
            //Вибір напрямку програми
            if (in.equals("encoding")) {
                if (exists(of(filePath))) {
                    List<String> list = readAllLines(of(filePath));
                    new Encoding(list.toString(), numb);
                }
            } else if (in.equals("decoding")) {
                if (exists(of(filePath))) {
                    List<String> list = readAllLines(of(filePath));
                    new Decoding(list.toString(), numb);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file");
        } catch (Exception e) {
            System.out.println("Oh, you have to a Big one. So, do something!" + e);
        } finally {
            System.out.print("End!!");
        }
//Add Vaska durak!!
    }
}
