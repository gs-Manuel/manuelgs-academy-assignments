package com.github.gsManuel.Exercise_2.controllers.operations;

import com.github.gsManuel.Exercise_2.controllers.Operations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.AssertTrue.assertTrue;

public class AddTest implements Operations {
    @Test
    public void givenNegativeNumberswhenAddthenGoodres() {
        assertTrue(Operations.add(1, 2), 3);
        assertTrue(Operations.add(-1, -8), -9);
        assertTrue(Operations.add(0, 0), 0);
        assertTrue(Operations.add(2.5, 5.7), 8.2);
    }
}
