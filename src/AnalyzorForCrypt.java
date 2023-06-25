
public class AnalyzorForCrypt extends Encoding{
    private int count = 0;
    private int keyOptionOne = 1;
    private int keyOptionTwo = 2;
    private int keyOptionThree = 3;
    private int keyOptionFour = 4;
    private int bigNumberForExample = 9;
    private char keyCharStar = '*';
    private char keyCharPersent = '%';
    public int analyzorForCrypt(String list){
        char[] copyOfList = list.toCharArray();

        for (int i = 1; i < 4; i++) {
            if (copyOfList[i] == keyCharStar){
                count++;
            }else if (copyOfList[i] == keyCharPersent) {
                count += 2;
            }
        }

        if (count == keyOptionOne) {
            return count = firstKeyForStep;
        } else if (count == keyOptionTwo) {
            return count = secondKeyForStep;
        } else if (count == keyOptionThree) {
            return count = thirdKeyForStep;
        } else if (count == keyOptionFour) {
            return count = bigNumberForExample;
        }
        return count;
    }
}
