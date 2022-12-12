package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    int m,n,result;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void onlyOneSpace(){

        m = 1;
        n = 1;
        result = 1;

        assertEquals(result, solution.uniquePaths(m,n));
    }

    @Test
    public void threeColumnsTwoRows(){

        m = 3;
        n = 2;
        result = 3;

        assertEquals(result, solution.uniquePaths(m,n));
    }

    @Test
    public void threeColumnsSevenRows(){

        m = 3;
        n = 7;
        result = 28;

        assertEquals(result, solution.uniquePaths(m,n));
    }
}
