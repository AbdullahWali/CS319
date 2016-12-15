package GameEntities.Pieces;
import GameEntities.Abilities.Ability;

public abstract class  Piece {

    protected int maxHp;
    protected int hp;
    protected int ap;
    protected PieceColor color;
    protected Ability skill;
    public enum PieceColor {
        WHITE, BLACK
    }

    //Methods
    public boolean isValid (int curX, int curY, int tarX, int tarY) {
        if (tarX > 7 || tarX < 0 || tarY > 7 || tarY <0)
            return false;
        if (curX == tarX && curY == tarY )
            return false;
        return true;
    }

    public void changeHP (int amount) {
        hp = hp + amount;

        if (hp < 0 )
            hp = 0;
        if (hp > maxHp)
            hp = maxHp;
    }

    public PieceColor getColor(){
        return color;
    }

    public int getAP() {
        return ap;
    }

    public int getHP() {
        return hp;
    }

    public Ability getAbility() {
        return skill;
    }

}
