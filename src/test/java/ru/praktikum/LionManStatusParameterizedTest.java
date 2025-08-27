package ru.praktikum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)


public class LionManStatusParameterizedTest {
    private final String sex;
    private final boolean expectedResult;
    Feline feline = Mockito.mock(Feline.class);


    public LionManStatusParameterizedTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

        };
    }

    @Test
    public void ShouldReturnTrueIfSexMAndReturnFalseIfSexWManStatus() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedResult, actualResult);
    }


}
