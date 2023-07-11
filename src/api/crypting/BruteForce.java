package api.crypting;

import api.keys.KeyFour;
import api.keys.KeyOne;
import api.keys.KeyThree;
import api.keys.KeyTwo;

public class BruteForce {
    protected int stepByThree = 3;
    protected int stepByFive = 5;
    protected int stepBySeven = 7;
    protected int stepByNine = 9;

    public BruteForce(String textForCrypt){
        int key = new AnalyzorForCrypt().AnalyzorForCrypt(textForCrypt);

        if(key == stepByThree){ new KeyOne(textForCrypt);
        } else if (key == stepByFive) { new KeyTwo(textForCrypt);
        } else if (key == stepBySeven) { new KeyThree(textForCrypt);
        } else if (key == stepByNine) { new KeyFour(textForCrypt);
        }else System.out.println("I don`t know how to help you!");
        
    }
}
