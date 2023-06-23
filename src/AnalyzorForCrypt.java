import java.util.Objects;

public class AnalyzorForCrypt {

    public int analyzorForCrypt(String list){
        char[] copyOfList = list.toCharArray();
        int count = 0;
        char keyCharStar = '*';
        char keyCharPersent = '%';
        for (int i = 1; i < 4; i++) {
            if (Objects.equals(keyCharStar, copyOfList[i])){
                count++;
            } else if (Objects.equals(keyCharPersent, copyOfList[i])) {
                count += 2;

            }
        }
        if (count == 1) {
            return count = 3;
        } else if (count == 2) {
            return count = 5;
        } else if (count == 3) {
            return count = 7;
        } else if (count == 4) {
            return count = 9;
        }
        return count;
    }
}
