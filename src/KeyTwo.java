public class KeyTwo extends Encoding{
    protected int stepForString = 5;
    public KeyTwo(String list){
        String copyOfList = list.copyValueOf(list.toCharArray(), stepForString, list.length() - stepForString);
        new Decoding(copyOfList, secondKeyForStep);
    }
}
