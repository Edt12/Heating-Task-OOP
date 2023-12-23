public class OutsideWall {
    private double length;
    private double height;
    private WallSide wallSide;
    private WallTypes wallType;

    public OutsideWall(double length, WallTypes wallType,WallSide wallSide){
        setLength(length);
        setHeight();
        setWallType(wallType);
        setWallSide(wallSide);
    }
    public WallSide getWallSide() {
        return wallSide;
    }

    public void setWallSide(WallSide wallSide) {
        this.wallSide = wallSide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public WallTypes getWallType() {
        return wallType;
    }

    public void setWallType(WallTypes wallType) {
        this.wallType = wallType;
    }

    /**
     * Calculates area of wall
     */
    public double calcArea(){
        return getHeight() * getLength();
    }
    public double calcHeatLoss(WallTypes wallType, double tempDifference){
        return (calcArea() * tempDifference) * wallType.getHeatLossPerMeterCubed();

    }

}
