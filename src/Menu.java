import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.exists;
import static java.nio.file.Files.readAllLines;
import static java.nio.file.Path.of;

public class Menu extends Constants{

    public void Run(){
        System.out.print(MENU_INFO);
        String in = scanner.nextLine();
        List<String> list ;

            //Вибір напрямку програми
            if (in.equals("1")) {
               list = new FirstOperation().ChooseTheFile();
               int numb = new FirstOperation().ChooseTheStep();
                // String path = "d://test.txt";
                new Encoding(list.toString(), numb);

            } else if (in.equals("2")) {
                list = new FirstOperation().ChooseTheFile();
                int numb = new FirstOperation().ChooseTheStep();
                // String path = "d://test.txt";
                new Decoding(list.toString(), numb);

            }else if(in.equals("0")){
                System.out.println("Program is going to End. Bye!");
            }
    }
}
