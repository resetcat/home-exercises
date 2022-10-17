package test.java.io.odelex.advancedJavaTest;

import io.codelex.advancedJavaTest.exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class JoinerTest {

//    static<T> String joinMethod(List<T> list, String separator, )

    @Test
    void testIntegerJoining() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(3);
        ints.add(4);
        Joiner integerJoiner = new Joiner("-");
        String result = integerJoiner.join(ints);
        Assertions.assertEquals("1-3-4", result);
    }
}
