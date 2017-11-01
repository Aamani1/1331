//import java.util.Arrays;
/**
 * Represents a Piece named Bishop which overrides Piece’s abstract methods
 *
 * @author akonduru2
 * @version 1.0
 */
public class Bishop extends Piece {

/**
*
*  @param clr the color of the piece
*/
    public Bishop(Color clr) {
        super(clr);
    }

    @Override
    public String algebraicName() {
        return "B";
    }

    @Override
    public String fenName() {
        //color
        Color clr = this.getColor();
        if (clr == Color.WHITE) {
            return "B";
        } else {
            return "b";
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

        Square[]  movesArr = new Square[14];

        //System.out.println(Arrays.toString(movesArr));
        int i = 0;
        //System.out.println(file + " " + rank);
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

        Square[] bmovesArr = new Square[i];
        for (int x = 0; x < i; x++) {
            bmovesArr[x] = movesArr[x];
        }
        //System.out.println(Arrays.toString(movesArr));
        return bmovesArr;
    }
}
