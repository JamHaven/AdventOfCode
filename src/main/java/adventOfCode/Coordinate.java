package adventOfCode;

public class Coordinate {
    int posX;
    int posY;

    public Coordinate(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public boolean isCenter(){
        if(posX == 0 && posY == 0){
            return true;
        }
        return false;
    }


    public Coordinate moveUp( int count){
        this.posY = this.posY + count;
        return new Coordinate(this.posX,this.posY);
    }

    public Coordinate moveDown(int count){
        this.posY = this.posY - count;
        return new Coordinate(this.posX,this.posY);
    }

    public Coordinate moveLeft(int count){
        this.posX = this.posX - count;
        return new Coordinate(this.posX,this.posY);
    }

    public Coordinate moveRight(int count){
        this.posX = this.posX + count;
        return new Coordinate(this.posX,this.posY);
    }

}
