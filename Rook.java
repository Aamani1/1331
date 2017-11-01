//import java.util.Arrays;
/**
 * Represents a Piece named Bishop which overrides Piece’s abstract methods
 *
 * @author akonduru2
 * @version 1.0
 */
public class Rook extends Piece {

/**
*
*  @param clr the color of the piece
*/
    public Rook(Color clr) {
        super(clr);
    }

    @Override
    public String algebraicName() {
        return "R";
    }

    @Override
    public String fenName() {
        //color
        Color clr = this.getColor();

        if (clr == Color.WHITE) {
            return "R";
        } else {
            return "r";
        }
    }

/**
 *
 * @param square that stores the value of square moves
 * @return array of possible moves
 */
    @Override
    public Square[] movesFrom(Square square) {
        char file = square.getFile();
        char rank = square.getRank();

        Square[]  movesArr = new Square[14];

        //System.out.println(Arrays.toString(movesArr));
        int i = 0;
        for (char newfile = 'a'; newfile <= 'h'; newfile++) {
            //System.out.println(newfile + " "+ rank);
            if (newfile != square.getFile()) {
                movesArr[i++] = new Square(newfile, rank);
            }
        }
        for (char newrank = '1'; newrank <= '8'; newrank++) {
            //System.out.println(file + " " +newrank);
            if (newrank != square.getRank()) {
                movesArr[i++] = new Square(file, newrank);
            }
        }
        //System.out.println(Arrays.toString(movesArr));
        return movesArr;
    }
}