package api;
import api.crypting.BruteForce;
import api.crypting.Decoding;
import api.crypting.Encoding;
import api.crypting.FileAndKeyForCrypt;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final String WELCOME_INFO = """
            ********************************************
            *               WELCOME!!!                 *
            ********************************************
            """;
    private static final  String PROGRAM_INFO = """
            This program for Encoding, Decoding 
            and another Decoding by method - Brute Force
            from youre file.
            """;
    private static final String MENU_INFO =
            """
                    Choose the options:
                    1: Encoding
                    2: Decoding
                    3: Brute Force
                    0: Exit
                    """;
    private static final String LOADING = """
            Loading...Work in progress...
            Done!
            """;

    private static final String ENCODING_ITEM = "1";
    private static final String DECODING_ITEM = "2";
    private static final String BRUTE_FORCE_ITEM = "3";
    private static final String EXIT_ITEM = "0";
    public static boolean isRunning = true;
    public void run(){
        System.out.println(WELCOME_INFO);
        System.out.println(PROGRAM_INFO);

        while (isRunning){

            System.out.print(MENU_INFO);
            Scanner menuIn = new Scanner(System.in);
            String menuChooseItem = menuIn.nextLine();
            List<String> inputFileForWork ;

            switch (menuChooseItem){
                case ENCODING_ITEM -> {
                    inputFileForWork = new FileAndKeyForCrypt().chooseTheFile();
                    int key = new FileAndKeyForCrypt().chooseTheKey();
                    new Encoding(inputFileForWork.toString(), key);
                    System.out.println(LOADING);
                }
                case DECODING_ITEM -> {
                    inputFileForWork = new FileAndKeyForCrypt().chooseTheFile();
                    int key = new FileAndKeyForCrypt().chooseTheKey();
                    new Decoding(inputFileForWork.toString(), key);
                    System.out.println(LOADING);
                }
                case BRUTE_FORCE_ITEM -> {
                    inputFileForWork = new FileAndKeyForCrypt().chooseTheFile();
                    new BruteForce(inputFileForWork.toString());
                    System.out.println(LOADING);
                }
                case EXIT_ITEM -> {
                    System.out.println("That`s all! See you later!");
                    isRunning = false;
                }
                default -> System.out.println("Wrong number! Try again!");
            }
        }
    }
}
