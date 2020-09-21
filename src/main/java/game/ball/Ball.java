package game.ball;

import utilities.Utilities;

public class Ball {

    private int xCoordinate, yCoordinate;

    private Utilities util = new Utilities();

    public Ball() {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
    }

    public void moveUp() {
        if (util.isInArea(yCoordinate)) {
            yCoordinate++;
        }
    }

    public void moveDown() {
        if (util.isInArea(yCoordinate)) {
            yCoordinate--;
        }
    }

    public int getYCoordinate() {
        return yCoordinate;
    }
}
