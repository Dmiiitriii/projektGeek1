package HW21;

public class Treadmill {
    private int maxDistanceRun;

    public Treadmill(int maxDistanceRun) {
        this.maxDistanceRun = maxDistanceRun;
    }

    public int distance(){
        int distance = (int)(Math.random()*maxDistanceRun+1);
        return distance;
    }

}
