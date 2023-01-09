package model;

import java.util.Objects;

// Represents a section of the snake's body in the game board
public class Section {
    public static final int SECTION_SIZE = 40;
    private int column;
    private int row;


    // EFFECTS: creates a section of the snake's body at the given position
    public Section(int col, int row) {
        this.column = col;
        this.row = row;
    }

    // EFFECTS: returns the x-position of this section
    public int getColumn() {
        return column;
    }

    // EFFECTS: returns the y-position of this section
    public int getRow() {
        return row;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return column == section.column && row == section.row;
    }

    @Override
    public int hashCode() {
        return Objects.hash(column, row);
    }
}
