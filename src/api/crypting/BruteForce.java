package api.crypting;


import api.keys.KeyFour;
import api.keys.KeyOne;
import api.keys.KeyThree;
import api.keys.KeyTwo;

import java.util.HashMap;

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

//        var keys = new HashMap<>();
//        keys.put(stepByThree,new KeyOne(textForCrypt));
//        keys.put(stepByFive,new KeyTwo(textForCrypt));
//        keys.put(stepBySeven,new KeyThree(textForCrypt));
//        keys.put(stepByNine,new KeyFour(textForCrypt));
//
//        keys.getOrDefault(key,"I don`t know how to help you!");
    }
}
