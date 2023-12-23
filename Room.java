import java.util.ArrayList;

public class Room {
    static String TOTAL_ENERGY_NEEDED_OUTPUT = "The total heat loss of this room is %f";
    ArrayList<OutsideWall> outsideWalls = new ArrayList<>();
    final private String name;
    private double length;
    private double width;
    private double height;
    private double tempDifference;
    public Room(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        for (OutsideWall elem: outsideWalls) {

        }
    }

    public double getTempDifference() {
        return tempDifference;
    }

    public void setTempDifference(double tempDifference) {
        this.tempDifference = tempDifference;
    }

    /**
     *  Adds OutsideWalls to room
     * @param length Length of wall
     * @param height Height of wall
     * @param wallType Type of wall
     */
    public void addWall(double length , double height , WallTypes wallType,WallSide wallSide){
        OutsideWall outsideWall = new OutsideWall(length, height ,wallType,wallSide);
        outsideWalls.add(outsideWall);

    }

    @Override
    public String toString() {
        double totalHeatLoss = 0;
        for (OutsideWall outsideWall: outsideWalls) {
            totalHeatLoss += outsideWall.calcHeatLoss(outsideWall.getWallType(),getTempDifference());
        }
        return String.format(TOTAL_ENERGY_NEEDED_OUTPUT , totalHeatLoss);

    }
}
