package api;

import api.crypting.BruteForce;
import api.crypting.Decoding;
import api.crypting.Encoding;
import api.crypting.FileAndKeyForCrypt;

import java.util.List;
import java.util.Scanner;

public class MenuItem {
    private static final String MENU_INFO =
            """
                    Choose the options:
                    1: Encoding
                    2: Decoding
                    3: Brute Force
                    0: Exit
                    """;
    private static final String ENCODING_ITEM = "1";
    private static final String DECODING_ITEM = "2";
    private static final String BRUTE_FORCE_ITEM = "3";
    private static final String EXIT_ITEM = "0";
    public static boolean isRunning = true;

    public MenuItem(){
        System.out.print(MENU_INFO);
        Scanner menuIn = new Scanner(System.in);
        String menuChooseItem = menuIn.nextLine();
        List<String> list ;

        switch (menuChooseItem){
            case ENCODING_ITEM -> {
                list = new FileAndKeyForCrypt().chooseTheFile();
                int number = new FileAndKeyForCrypt().chooseTheKey();
                new Encoding(list.toString(), number);
            }
            case DECODING_ITEM -> {
                list = new FileAndKeyForCrypt().chooseTheFile();
                int numb = new FileAndKeyForCrypt().chooseTheKey();
                new Decoding(list.toString(), numb);
            }
            case BRUTE_FORCE_ITEM -> {
                list = new FileAndKeyForCrypt().chooseTheFile();
                new BruteForce(list.toString());
            }
            case EXIT_ITEM -> {
                System.out.println("Program is going to End. Bye!");
                isRunning = false;
            }
            default -> System.out.println("Wrong number! Try again!");
        }

    }
}
