package ru.job4j.chess.firuges.black;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;


public class BishopBlackTest {

    @Test
    public void positionTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position(), is(Cell.C8));
    }

    @Test
    public void copyTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.copy(Cell.A6).position(), is(Cell.A6));
    }

    @Test
    public void wayTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] res = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5), is(res));
    }

    @Test
    public void isDiagonalTestTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertTrue(bishopBlack.isDiagonal(Cell.C1, Cell.H6));
    }

    @Test
    public void isDiagonalTestFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertFalse(bishopBlack.isDiagonal(Cell.C1, Cell.H5));
    }
}