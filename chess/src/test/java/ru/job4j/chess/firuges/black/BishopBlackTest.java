package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell rslMetod = bishopBlack.position();
        Cell expected = Cell.C1;
        assertEquals(expected, rslMetod);
    }

    @Test
    public void testPositionNext() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C2);
        assertEquals(Cell.C2, bishopBlack.position());
    }

    @Test
    public void whenCopyBishopBlack() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F1);
        Figure bishopBlack1 = bishopBlack.copy(Cell.F8);
        Cell result = bishopBlack1.position();
        Cell expected = Cell.F8;
        assertEquals(expected, result);
    }

    @Test
    public void whenWayBishopBlack() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, result);
    }
}