//import java.util.Arrays;
/**
 * Represents a Piece named Bishop which overrides Piece’s abstract methods
 *
 * @author akonduru2
 * @version 1.0
 */

public class Knight extends Piece {

/**
*
*  @param clr the color of the piece
*/
    public Knight(Color clr) {
        super(clr);
    }

    @Override
    public String algebraicName() {
        return "N";
    }

    @Override
    public String fenName() {

        //color
        Color clr = this.getColor();

        if (clr == Color.WHITE) {
            return "N";
        } else {
            return "n";
        }
    }

/**
 *
 * @param square that stores the value of square moves
 * @return array of possible moves
 */
    public Square[] movesFrom(Square square) {
        char file = square.getFile();
        char rank = square.getRank();


        Square[]  movesArr = new Square[8];
        int i = 0;

        if (rank - 2 > '0' && file - 1 >= 'a') {
            movesArr[0] = new Square((char) (file - 1), (char) (rank - 2));
        }
        if (rank - 2 > '0' && file + 1 <= 'h') {
            movesArr[1] = new Square((char) (file + 1), (char) (rank - 2));
        }
        if (rank - 1 > '0' && file - 2 >= 'a') {
            movesArr[2] = new Square((char) (file - 2), (char) (rank - 1));
        }
        if (rank - 1 > '0' && file + 2 <= 'h') {
            movesArr[3] = new Square((char) (file + 2), (char) (rank - 1));
        }
        if (rank + 1 <= '8' && file - 2 >= 'a') {
            movesArr[4] = new Square((char) (file - 2), (char) (rank + 1));
        }
        if (rank + 1 <= '8' && file + 2 <= 'h') {
            movesArr[5] = new Square((char) (file + 2), (char) (rank + 1));
        }
        if (rank + 2 <= '8' && file - 1 >= 'a') {
            movesArr[6] = new Square((char) (file - 1), (char) (rank + 2));
        }
        if (rank + 2 <= '8' && file + 1 <= 'h') {
            movesArr[7] = new Square((char) (file + 1), (char) (rank + 2));
        }

        int count = 0;
        for (int x = 0; x < 8; x++) {
            if (movesArr[x] != null) {
                count++;
                //System.out.println(count);
            }
        }
        Square[] nmovesArr = new Square[count];
        //System.out.println(Arrays.toString(nmovesArr));
        int ct = 0;
        for (int j = 0; j < movesArr.length; j++) {
            if (movesArr[j] != null) {
                nmovesArr[ct] = movesArr[j];
                ct++;
            }
        }
        //System.out.println(Arrays.toString(nmovesArr));
        return nmovesArr;
    }
}