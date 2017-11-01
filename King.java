//import java.util.Arrays;
/**
 * Represents a Piece named Bishop which overrides Piece’s abstract methods
 *
 * @author akonduru2
 * @version 1.0
 */

public class King extends Piece {

/**
*
*  @param clr the color of the piece
*/
    public King(Color clr) {
        super(clr);
    }

    @Override
    public String algebraicName() {
        return "K";
    }

    @Override
    public String fenName() {
        //color
        Color clr = this.getColor();

        if (clr == Color.WHITE) {
            return "K";
        } else {
            return "k";
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

        Square[]  movesArr;

        if ((file == 'a' || file == 'h') && (rank == '1' || rank == '8')) {
            movesArr = new Square[3];
            //System.out.println(file);
            //System.out.println(rank);
            //System.out.println(Arrays.toString(movesArr));
        } else if (rank == '1' || rank == '8' || file == 'a' || file == 'h') {
            movesArr = new Square[5];
            //System.out.println(file);
            //System.out.println(rank);
            //System.out.println(Arrays.toString(movesArr));
        } else {
            movesArr = new Square[8];
            // System.out.println(file);
            // System.out.println(rank);
            // System.out.println(Arrays.toString(movesArr));
        }

        int i = 0;

        if (rank != '8') {
            movesArr[i++] = new Square(file , (char) (rank + 1));
            // System.out.println(file);
            // System.out.println(rank);
            //System.out.println(Arrays.toString(movesArr));
        }
        if (file < 'h' && rank != '8') {
            movesArr[i++] = new Square((char) (file + 1) , (char) (rank + 1));
            //System.out.println(Arrays.toString(movesArr));
        }
        if (file < 'h') {
            movesArr[i++] = new Square((char) (file + 1) , rank);
            //System.out.println(Arrays.toString(movesArr));
        }
        if (rank > '1') {
            movesArr[i++] = new Square(file , (char) (rank - 1));
            //System.out.println(Arrays.toString(movesArr));
        }
        if (file > 'a') {
            movesArr[i++] = new Square((char) (file - 1) , rank);
            //System.out.println(Arrays.toString(movesArr));
            //a-1 >=0
        }
        if (file > 'a' && rank > '1') {
            movesArr[i++] = new Square((char) (file - 1) , (char) (rank - 1));
            //System.out.println(Arrays.toString(movesArr));
            // a-1 >=0 b-1>=0
        }
        if (file > 'a' && rank != '8') {
            movesArr[i++] = new Square((char) (file - 1) , (char) (rank + 1));
            //System.out.println(Arrays.toString(movesArr));
            //a-1 >=0 b+1<pieces.length
        }
        if (file < 'h' && rank > '1') {
            movesArr[i++] = new Square((char) (file + 1) , (char) (rank - 1));
            //System.out.println(Arrays.toString(movesArr));
            // a+1 < pieces.length b-1 >=0
        }

        // int count = 0;
        // for (int i = 0; i < 8 ; i++) {
        //     if (movesArr[i] != null) {
        //         count++;
        //     }
        // }
        // Square[] kmovesArr = new Square[count];
        // int ct = 0;
        // for (int i = 0; i < movesArr.length; i++) {

        //     if(movesArr[i] != null){
        //         kmovesArr[ct] = movesArr[i];
        //         ct++;
        //     }



        // // }
        // //return kmovesArr;
        // //return movesArr;
        //     System.out.println(Arrays.toString(kmovesArr));
        return movesArr;
    }

}
