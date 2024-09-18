package javaBaseball;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BaseBall {


    public LinkedHashSet<Integer> makeRandomNumber() {
        Set<Integer> randomNumbers = new LinkedHashSet<>();

        while (randomNumbers.size()<3) {
            int randomNumber = (int)(Math.random() * 9) + 1;
            randomNumbers.add(randomNumber);
        }
        return (LinkedHashSet<Integer>) randomNumbers;
    }


}
