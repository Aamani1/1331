//import java.util.Arrays;
/**
 * Represents a Piece named Bishop which overrides Piece’s abstract methods
 *
 * @author akonduru2
 * @version 1.0
 */
public class Queen extends Piece {

/**
*
*  @param clr the color of the piece
*/
    public Queen(Color clr) {
        super(clr);
    }

    @Override
    public String algebraicName() {
        return "Q";
    }

    @Override
    public String fenName() {
        //color
        Color clr = this.getColor();

        if (clr == Color.WHITE) {
            return "Q";
        } else {
            return "q";
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

        Square[]  movesArr = new Square[27];

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

        for (char newfile = file , newrank = rank; newfile <= 'h'
            && newrank <= '8'; newrank++, newfile++) {
            //System.out.println(newfile + " " + newrank);
            if (newrank != square.getRank()) {
                movesArr[i++] = new Square(newfile, newrank);
            }
        }
        //checking up and to the left
        for (char newfile = file , newrank = rank; newfile >= 'a'
            && newrank >= '1'; newrank--, newfile--) {
            //System.out.println(newfile + " " + newrank);
            if (newrank != square.getRank()) {
                movesArr[i++] = new Square(newfile, newrank);
            }
        }
        // checking up to the right
        for (char newfile = file , newrank = rank; newfile >= 'a'
            && newrank <= '8'; newrank++, newfile--) {
            //System.out.println(newfile + " " + newrank);
            if (newrank != square.getRank()) {
                movesArr[i++] = new Square(newfile, newrank);
            }
        }
        // checking up to the left
        for (char newfile = file , newrank = rank; newfile <= 'h'
            && newrank >= '1'; newrank--, newfile++) {
            //System.out.println(newfile + " " + newrank);
            if (newrank != square.getRank()) {
                movesArr[i++] = new Square(newfile , newrank);
            }
        }

        Square[] qmovesArr = new Square[i];
        for (int x = 0; x < i; x++) {
            qmovesArr[x] = movesArr[x];
        }
        //System.out.println(Arrays.toString(movesArr));
        return qmovesArr;
    }

}