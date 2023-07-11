package api.keys;

import api.crypting.Decoding;
import api.crypting.SecretKey;

public class KeyOne extends SecretKey {
    protected int keyForString = 4;
    public KeyOne(String textForCrypt){
        String copyOfList = textForCrypt.copyValueOf(textForCrypt.toCharArray(), keyForString, textForCrypt.length() - keyForString);
        new Decoding(copyOfList, firstKeyForStep);
    }


}
