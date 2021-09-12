package model;

// Represents a section in the game board
public class Section {
    private static final int SECTION_SIZE = 40;
    private int column;
    private int row;

    // EFFECTS: creates a section at the given position
    public Section(int col, int row) {
        this.column = col;
        this.row = row;
    }

    // EFFECTS: returns column of this section
    public int getColumn() {
        return column;
    }

    // EFFECTS: returns row of this section
    public int getRow() {
        return row;
    }
}
