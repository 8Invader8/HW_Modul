

import java.io.FileNotFoundException;
import java.nio.file.Files;

import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.*;
import static java.nio.file.Path.*;

public class Main {
    public static void main(String[] args) {

       // String languageCode = "абвгґдеєжзиіїйклмнопрстуфхцчшщьюя.,\"\":-!? "; // Створюю алфавіт по якому ми будемо проходитися під час шифрувані
       //char[] chars = .toCharArray();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Виберіть шифрування(encoding) або розшифрування(decoding): ");
        String in = scanner.nextLine();
        String path = "d://test.txt";
        System.out.print("Введіть крок сдвигу: ");
        int numb = scanner.nextInt();

        try{
            //Вибір напрямку програми
            if(in.equals("encoding")){
                if(exists(of(path))){
                    List<String> list = Files.readAllLines(of(path));
                    new Encoding(list.toString(), numb);
                }
            }else if(in.equals("decoding")){
                if(exists(of(path))){
                    List<String> list = Files.readAllLines(of(path));
                    new Decoding(list.toString(), numb);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("Cannot find file");
        }catch (Exception e){
            System.out.println("Oh, you have to a Big one. So, do something!" + e);
        }finally {
            System.out.print("End!!");
        }

    }
}