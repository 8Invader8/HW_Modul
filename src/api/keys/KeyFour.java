package api.keys;

import api.crypting.Decoding;
import api.crypting.SecretKey;

public class KeyFour extends SecretKey {
    private int keyFour = 9;
    protected int stepForString = 5;
    public KeyFour(String textForCrypt){
        String copyOfList = textForCrypt.copyValueOf(textForCrypt.toCharArray(), stepForString, textForCrypt.length() - stepForString);
        new Decoding(copyOfList, keyFour);
    }
}
