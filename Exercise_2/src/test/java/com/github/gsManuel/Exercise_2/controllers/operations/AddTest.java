package com.github.gsManuel.Exercise_2.controllers.operations;

import com.github.gsManuel.Exercise_2.controllers.Operations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTest implements Operations {
    @Test
    public void givenNegativeNumberswhenAddthenGoodres() {
        assertEquals(Operations.add(1, 2), 3.0);
        assertEquals(Operations.add(-1, -8), -9);
        assertEquals(Operations.add(0, 0), 0);
        assertEquals(Operations.add(2.5, 5.7), 8.2);
    }
}
