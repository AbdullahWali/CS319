package GameEntities.Pieces;

/**
 * Created by Abdullah Wali on 09/12/2016.
 */
public class Queen  extends Piece {

    @Override
    public boolean isValid(int curX, int curY, int tarX, int tarY) {
        if(!super.isValid(curX, curY, tarX, tarY))
            return false;
        else if (Math.abs(curX - tarX) != Math.abs(curY - tarY) && (curX != tarX && curY != tarY)) //combination of bishop and rook
            return false;
        else
            return true;
    }
}
