public class Board {
    private Square[][] board;
    private int rows;
    private int cols;

    public Board(int rows, int cols) {
        board = new Square[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
}

