/**
 * Represents a square on the chess board
 *
 * @author akonduru2
 * @version 1.0
 */
public class Square {
    private char file;
    private char rank;

/**
 * Creates a chess square with a file and a column
 *
 * @param file is the column in which the move is in
 * @param rank is the row in which the move is in
 */
    public Square(char file, char rank) {
        this.file = file;
        this.rank = rank;
    }
/**
 * the file and the rank from above make up name
 *
 * @param name store the value of file and rank
 *
 */
    public Square(String name) {
        file = name.charAt(0);
        rank = name.charAt(1);
    }

/**
 * @return the moves file/column
 */
    public char getFile() {
        return file;
    }

/**
 * @return the moves rank/row
 */
    public char getRank() {
        return rank;
    }

/**
 * @return the string format of the square with uses file and rank
 */
    public String toString() {
        return String.format("%c%c", file, rank);
        //return String(file + "" + rank);
    }

/**
 * @param other overrides the equals method from java.lang.Object
 * @return true for Square objects that have the same file and rank values,
 *         false otherwise.
 */
    public boolean equals(Object other) {
        if (null == other) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof Square)) {
            return false;
        }
        Square that = (Square) other;
        return this.file == that.file && this.rank == that.rank;
    }
}