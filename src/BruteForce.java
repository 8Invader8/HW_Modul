public class BruteForce {
    private int stepByThree = 3;
    private int stepByFive = 5;
    private int stepBySeven = 7;
    private int stepByNine = 9;
    public BruteForce(String list){
        int number = new AnalyzorForCrypt().analyzorForCrypt(list);
        if(number == stepByThree){ new KeyOne(list);
        } else if (number == stepByFive) { new KeyTwo(list);
        } else if (number == stepBySeven) { new KeyTree(list);
        } else if (number == stepByNine) { new KeyFour(list);
        }else System.out.println("I don`t know how to help you!");

    }
}
