/**
 * This is the work of Ephraim Pillar.
 */

public class Blues {
    public static void main(String[] args) {
        QBoard qb = new QBoard(8);

        for (int row = 0; row < qb.columnSize(); row++) {
            for (int col = (row + 1); col < qb.columnSize(); col++) {
                qb.putQueen(row, col, QBoard.BLUE);
            }
        }
    }
}
