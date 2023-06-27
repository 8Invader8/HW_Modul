public class KeyFour extends Encoding{
    private int keyNine = 9;
    protected int stepForString = 5;
    public KeyFour(String list){
        String copyOfList = list.copyValueOf(list.toCharArray(), stepForString, list.length() - stepForString);
        new Decoding(copyOfList, keyNine);
    }
}
