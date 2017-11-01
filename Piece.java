/**
 * Abstract class that represents different chess pieces
 *
 * @author akonduru2
 * @version 1.0
 */

public abstract class Piece {

    private Color clr;
/**
 *
 * @param clr stores the value of color in an instance variable
 *
 */
    public Piece(Color clr) {
        this.clr = clr;
    }

/**
 *
 * @return the color of the piece
 *
 */
    public Color getColor() {
        return clr;
    }
/**
 * @return algebraic name of a piece in a string format
 *
 */
    public abstract String algebraicName();
/**
 * @return fen name of a piece in a string format
 *
 */
    public abstract String fenName();
/**
 * @param square that stores the value of square moves
 * @return a square array containting all the possible moves of that piece
 */
    public abstract Square[] movesFrom(Square square);


}

