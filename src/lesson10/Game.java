package lesson10;

public class Game {

    private Board board;
    private Player p1;
    private Player p2;
    private Player currentPlayer;

    public Game() {
        this.board = new Board();
        this.p1 = new ComputerPlayer("X");
        this.p2 = new ComputerPlayer("O");
        this.currentPlayer = p1;
    }

    public void play() {
        while (true) {
            board.printBoardToConsole();
            Move move = currentPlayer.getMove();
            while (!board.isMoveValid(move)) {
                System.out.println("Your move not valid. Try again!");
                move = currentPlayer.getMove();
            }
            board.doMove(move);
            board.printBoardToConsole();
            if (board.isWin()) {
                System.out.println("You win!");
                break;
            }
            if (board.isDraw()) {
                System.out.println("Draw!");
                break;
            }

            changeCurrentPlayer();
        }
    }

    private void changeCurrentPlayer() {
        if (currentPlayer == p1) {
            currentPlayer = p2;
        } else {
            currentPlayer = p1;
        }
    }

}
