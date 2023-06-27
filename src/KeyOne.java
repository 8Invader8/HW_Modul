public class KeyOne extends Encoding{
    protected int stepForString = 4;
    public KeyOne(String list){
        String copyOfList = list.copyValueOf(list.toCharArray(), stepForString, list.length() - stepForString);
        new Decoding(copyOfList, firstKeyForStep);
    }


}
