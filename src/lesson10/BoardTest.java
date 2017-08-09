package lesson10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {

    @Test
    public void isWinInARow() {
        Board board = new Board();
        board.doMove(new Move(0, 0, "X"));
        board.doMove(new Move(0, 1, "X"));
        board.doMove(new Move(0, 2, "X"));
        assertEquals(board.isWin(), true);
    }

    @Test
    public void isWinInACol() {
        Board board = new Board();
        board.doMove(new Move(0, 0, "X"));
        board.doMove(new Move(1, 0, "X"));
        board.doMove(new Move(2, 0, "X"));
        assertEquals(board.isWin(), true);
    }

    @Test
    public void isWinInACol2() {
        Board board = new Board();
        board.doMove(new Move(0, 1, "X"));
        board.doMove(new Move(1, 1, "X"));
        board.doMove(new Move(2, 1, "X"));
        assertEquals(board.isWin(), true);
    }

}
