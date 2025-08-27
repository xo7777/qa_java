package ru.praktikum;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)


public class FelineGetKittensParameterizedTest {
    private final int kittensCount;
    private final int expectedResult;


    public FelineGetKittensParameterizedTest(int kittensCount, int expectedResult) {
        this.kittensCount = kittensCount;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {2, 2},
                {3, 3},
                {100, 100},
        };
    }

    @Test
    public void getKittensShouldReturnSameNumberOfKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(expectedResult, actual);
    }


}
