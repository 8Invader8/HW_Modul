import java.util.List;
import java.util.Scanner;

public class Menu {
    public static final String MENU_INFO =
            """
                    Choose the options:
                    1: Encoding
                    2: Decoding
                    3: Brute Force
                    0: Exit
                    """;
    public static final String ENCODING_ITEM = "1";
    public static final String DECODING_ITEM = "2";
    public static final String BRUTE_FORCE_ITEM = "3";
    public static final String EXIT_ITEM = "0";

    public void Run(){
        System.out.print(MENU_INFO);
        Scanner menuIn = new Scanner(System.in);
        String menuChooseItem = menuIn.nextLine();
        List<String> list ;

            //Вибір напрямку програми
            if (menuChooseItem.equals(ENCODING_ITEM)) {
               list = new FirstOperation().chooseTheFile();
               int numb = new FirstOperation().chooseTheStep();
                // String path = "d://test.txt";
                new Encoding(list.toString(), numb);

            } else if (menuChooseItem.equals(DECODING_ITEM)) {
                list = new FirstOperation().chooseTheFile();
                int numb = new FirstOperation().chooseTheStep();
                // String path = "d://test.txt";
                new Decoding(list.toString(), numb);

            }else if (menuChooseItem.equals(BRUTE_FORCE_ITEM)) {
                list = new FirstOperation().chooseTheFile();

                // String path = "d://test.txt";


            }else if(menuChooseItem.equals(EXIT_ITEM)){
                System.out.println("Program is going to End. Bye!");
            }
    }
}
