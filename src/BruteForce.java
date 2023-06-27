import java.util.HashMap;


public class BruteForce {
    protected int stepByThree = 3;
    protected int stepByFive = 5;
    protected int stepBySeven = 7;
    protected   int stepByNine = 9;

    public BruteForce(String list){
        int number = new AnalyzorForCrypt().analyzorForCrypt(list);

        if(number == stepByThree){ new KeyOne(list);
        } else if (number == stepByFive) { new KeyTwo(list);
        } else if (number == stepBySeven) { new KeyThree(list);
        } else if (number == stepByNine) { new KeyFour(list);
        }else System.out.println("I don`t know how to help you!");

    }
}
