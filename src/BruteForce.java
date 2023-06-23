public class BruteForce {

    public BruteForce(String list){
        int number = new AnalyzorForCrypt().analyzorForCrypt(list);
        switch(number){
            case 3 -> new KeyOne(list);
            case 5 -> new KeyTwo(list);
            case 7 -> new KeyTree(list);
            case 9 -> new KeyFour(list);
            default -> System.out.println("I don`t know how to help you!");

        }
    }
}
