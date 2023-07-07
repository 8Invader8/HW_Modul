package api.crypting;

public class AnalyzorForCrypt extends SecretKey{
    private int count = 0;
    private static final int KEY_ONE = 1;
    private static final int KEY_TWO = 2;
    private static final int KEY_THREE = 3;
    private static final int KEY_FOUR = 4;
    private  static final int IMPORTANT_NUMBER_FOR_CRYPT = 5;
    private static final int BIG_NUMBER_FOR_EXAMPLE = 9;
    private static final char KEY_CHAR_STAR = '*';
    private static final char KEY_CHAR_PERСENT = '%';

    public int AnalyzorForCrypt(String textForCrypt){
        char[] copyOfList = textForCrypt.toCharArray();

        for (int i = 1; i < IMPORTANT_NUMBER_FOR_CRYPT; i++) {
            if (copyOfList[i] == KEY_CHAR_STAR){
                count++;
            }else if (copyOfList[i] == KEY_CHAR_PERСENT) {
                count += KEY_TWO;
            }
        }
        switch (count){
            case KEY_ONE -> {return firstKeyForStep;}
            case KEY_TWO -> {return secondKeyForStep;}
            case KEY_THREE -> {return thirdKeyForStep;}
            case KEY_FOUR -> {return BIG_NUMBER_FOR_EXAMPLE;}
        }
        return count;
    }
}
