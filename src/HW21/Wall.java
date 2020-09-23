package HW21;

public class Wall {

    private int maxHeightWall;

    public Wall(int maxHeightWall) {
        this.maxHeightWall = maxHeightWall;
    }

    public int height(){
        int height = (int)(Math.random()*maxHeightWall+1);
        return height;
    }



}
