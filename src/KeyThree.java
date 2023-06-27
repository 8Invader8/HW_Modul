public class KeyThree extends Encoding{
    protected int stepForString = 5;
    public KeyThree(String list){
        String copyOfList = list.copyValueOf(list.toCharArray(), stepForString, list.length() - stepForString);
        new Decoding(copyOfList,thirdKeyForStep);
    }
}
