package javaBaseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RandomNumber {

    @Test
    void 순서가유지되는가() {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);

        List<Integer> list = new ArrayList<>(linkedHashSet);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));

    }


    @Test
    @DisplayName("임의의 중복되지 않는 난수 생성")
    void generateRandomNumber() {
        BaseBall ball = new BaseBall();
        LinkedHashSet<Integer> randomNumbers =  ball.makeRandomNumber();

        assertEquals(3,randomNumbers.size(), "랜덤 숫자가 3개 생성되어야 함");

        for (Integer number : randomNumbers) {
            assertTrue(1 <= number && number < 10,"숫자의 범위는 1-9");
        }
    }


}
