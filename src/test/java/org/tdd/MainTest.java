package org.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testGetXReturns0() {
        assertTrue(PlayerCharacter.getX() == 0);
    }
}
