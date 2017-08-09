package lesson10;

public class Board {

    private static final int FIELD_SIZE = 3;
    private static final String EMPTY_CELL = "-";

    private String[][] field;

    public Board() {
        this.field = new String[FIELD_SIZE][FIELD_SIZE];
        initFieldWithEmptyValues();
    }

    private void initFieldWithEmptyValues() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                field[i][j] = EMPTY_CELL;
            }
        }
    }

    public boolean isMoveValid(Move move) {
        return field[move.getX()][move.getY()].equals(EMPTY_CELL);
    }

    public void doMove(Move move) {
        field[move.getX()][move.getY()] = move.getSign();
    }

    public void printBoardToConsole() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public boolean isWin() {
        boolean win = false;
        for (int i = 0; i < FIELD_SIZE; i++) {
            if (field[i][0].equals(field[i][1])
                    && field[i][0].equals(field[i][2])
                    && !field[i][0].equals(EMPTY_CELL)) {
                win = true;
            }
        }
        for (int i = 0; i < FIELD_SIZE; i++) {
            if (field[0][i].equals(field[1][i])
                    && field[0][i].equals(field[2][i])
                    && !field[0][i].equals(EMPTY_CELL)) {
                win = true;
            }
        }

        if (field[0][0].equals(field[1][1])
                && field[0][0].equals(field[2][2])
                && !field[0][0].equals(EMPTY_CELL)) {
            win = true;
        }
        if (field[2][0].equals(field[1][1])
                && field[2][0].equals(field[0][2])
                && !field[2][0].equals(EMPTY_CELL)) {
            win = true;
        }
        return win;
    }

    public boolean isDraw() {
        boolean allCellsAreEmpty = true;
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (field[i][j].equals(EMPTY_CELL)) {
                    allCellsAreEmpty = false;
                }
            }
        }
        return !isWin() && allCellsAreEmpty;
    }

}
