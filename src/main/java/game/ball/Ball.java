package game.ball;

import game.coordinates.Coordinates;
import game.shapes.Circle;
import utilities.Utilities;

public class Ball {

    private Coordinates position;
    private Circle shape;
    private int velocity = 1;

    private Utilities util = new Utilities();

    public Ball(int xCoordinate, int yCoordinate, int radius) {
        this.position = new Coordinates(xCoordinate, yCoordinate);
        this.shape = new Circle(radius, this.position);
    }

    public void moveUp() {
        if (util.isInArea(position.getYCoordinate())) {
            this.position.setYCoordinate(position.getYCoordinate() + velocity);
        }
    }

    public void moveDown() {
        if (util.isInArea(position.getYCoordinate())) {
            this.position.setYCoordinate(position.getYCoordinate() - velocity);
        }
    }

    public Coordinates getPosition() {
        return position;
    }
}
