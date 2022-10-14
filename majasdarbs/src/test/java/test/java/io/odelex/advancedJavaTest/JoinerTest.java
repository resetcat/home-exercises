package test.java.io.odelex.advancedJavaTest;

import io.codelex.advancedJavaTest.exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

//    static<T> String joinMethod(List<T> list, String separator, )

    @Test
    void testIntegerJoining() {
        Joiner integerJoiner = new Joiner(1, "-", (a, b) -> a.toString() + b);
        String result = integerJoiner.join();
        Assertions.assertEquals("1-", result);
    }
}
