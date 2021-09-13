package model;

import java.util.Objects;

// Represents a section in the game board
public class Section {
    private static final int SECTION_SIZE = 40;
    private int column;
    private int row;

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
