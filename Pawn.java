//import java.util.Arrays;
/**
 * Represents a Piece named Bishop which overrides Piece’s abstract methods
 *
 * @author akonduru2
 * @version 1.0
 */
public class Pawn extends Piece {

/**
*
*  @param clr the color of the piece
*/
    public Pawn(Color clr) {
        super(clr);
    }

    @Override
    public String algebraicName() {
        return "";
    }

    @Override
    public String fenName() {
        //color
        Color clr = this.getColor();

        if (clr == Color.WHITE) {
            return "P";
        } else {
            return "p";
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
        Color clr = this.getColor();

        Square[]  movesArr;
        if (clr == Color.WHITE && rank == '2') {
            movesArr = new Square[2];
        } else if (clr == Color.BLACK && rank == '7') {
            movesArr = new Square[2];
        } else {
            movesArr = new Square[1];
        }

        //white
        if (clr == Color.WHITE) {
            if (rank == '2') {
                //System.out.println("row 2 whitep 2 moves in array");
                //System.out.println(file); //a,b,c
                //System.out.println(rank); //1,2,3
                //System.out.println(Arrays.toString(movesArr));
                movesArr[0] = new Square(file , (char) (rank + 1));
                movesArr[1] = new Square(file , (char) (rank + 2));
                //System.out.println("blah");
            } else if (rank == '8') {
                //System.out.println("scozcnm");
                //System.out.println(file);
                //System.out.println(rank);
                //System.out.println(Arrays.toString(new Square[0]));
                //movesArr[0] = new Square((char) 0, (char) 0);
                movesArr = new Square[0];
                //System.out.println(Arrays.toString(movesArr));
            } else { //remove
                //System.out.println("whitep 1 move in array");
                movesArr[0] = new Square(file , (char) (rank + 1));
                //System.out.println(file);
                //System.out.println(rank);
                //System.out.println(Arrays.toString(movesArr));
            }
        }
        //black
        if (clr == Color.BLACK && rank != '8') {
            if (rank == '7') {
                //System.out.println("row 7 blackp 2 moves in array");
                //System.out.println(file);
                //System.out.println(rank);
                //System.out.println(Arrays.toString(movesArr));
                movesArr[0] = new Square(file , (char) (rank - 1));
                movesArr[1] = new Square(file , (char) (rank - 2));
                //System.out.println(Arrays.toString(movesArr));
            } else if (rank == '1') {
                //System.out.println(file);
                //System.out.println(rank);
                //System.out.println(Arrays.toString(movesArr));
                movesArr[0] = new Square('\0' , '\0');
                //System.out.println(Arrays.toString(movesArr));
            } else { //remove
                //System.out.println("blackp 1 move in array");
                //System.out.println(file);
                //System.out.println(rank);
                //System.out.println(Arrays.toString(movesArr));
                movesArr[0] = new Square(file , (char) (rank - 1));
                //System.out.println(file);
                //System.out.println(rank);
                //System.out.println(Arrays.toString(movesArr));
            }
        }
        // int count = 0;
        // if(movesArr.length == 0) {
        //     count++;
        // } else if (movesArr.length == 1) {
        //     count++;
        // } else {
        //     for (int i = 0; i < 2 ; i++) {
        //         if (movesArr[i] != null) {
        //         count++;
        //         }
        //     }
        // }
        // Square[] pmovesArr = new Square[count];
        // for (int i = 0; i < count; i++) {
        //     pmovesArr[i] = movesArr[i];
        // }
        return movesArr;
    }
}