package org.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testGetXReturns0() {
        int[] location = {0, 0};
        assertTrue(PlayerCharacter.getX(location) == 0);
    }

    @Test
    void testGetYReturns0() {
        int[] location = {0, 0};
        assertTrue(PlayerCharacter.getY(location) == 0);
    }

    @Test
    void testMoveWMovesUp() {
        int[] testArr = {0, 1};
        assertTrue(Arrays.equals(PlayerCharacter.move("w", 0, 0), testArr));
    }

    @Test
    void testMoveAMovesLeft() {
        int[] testArr = {-1, 0};
        assertTrue(Arrays.equals(PlayerCharacter.move("a", 0, 0), testArr));
    }

    @Test
    void testMoveSMovesDown() {
        int[] testArr = {0, -1};
        assertTrue(Arrays.equals(PlayerCharacter.move("s", 0, 0), testArr));
    }

    @Test
    void testMoveDMovesRight() {
        int[] testArr = {1, 0};
        assertTrue(Arrays.equals(PlayerCharacter.move("d", 0, 0), testArr));
    }
}
