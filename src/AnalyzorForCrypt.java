
public class AnalyzorForCrypt extends Encoding{
    private int count = 0;
    private static final int KEY_ONE = 1;
    private static final int KEY_TWO = 2;
    private static final int KEY_THREE = 3;
    private static final int KEY_FOUR = 4;
    private static final int BIG_NUMBER_FOR_EXAMPLE = 9;
    private static final char KEY_CHAR_STAR = '*';
    private static final char KEY_CHAR_PERSENT = '%';

    public int analyzorForCrypt(String list){
        char[] copyOfList = list.toCharArray();

        for (int i = 1; i < 5; i++) {
            if (copyOfList[i] == KEY_CHAR_STAR){
                count++;
            }else if (copyOfList[i] == KEY_CHAR_PERSENT) {
                count += KEY_TWO;
            }
        }

        if (count == KEY_ONE) {
            return count = firstKeyForStep;
        } else if (count == KEY_TWO) {
            return count = secondKeyForStep;
        } else if (count == KEY_THREE) {
            return count = thirdKeyForStep;
        } else if (count == KEY_FOUR) {
            return count = BIG_NUMBER_FOR_EXAMPLE;
        }
        return count;
    }
}
