package api.keys;

import api.crypting.Decoding;
import api.crypting.SecretKey;

public class KeyThree extends SecretKey {
    protected int keyForString = 5;
    public KeyThree(String textForCrypt){
        String copyOfList = textForCrypt.copyValueOf(textForCrypt.toCharArray(), keyForString, textForCrypt.length() - keyForString);
        new Decoding(copyOfList,thirdKeyForStep);
    }
}
