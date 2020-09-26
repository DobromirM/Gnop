package game.paddle;

import game.coordinates.Coordinates;
import game.shapes.Rectangle;
import utilities.Utilities;

public class Paddle {

    private Coordinates position;
    private Rectangle shape;
    private PaddleSide side;
    private int velocity = 1;

    private Utilities util = new Utilities();

    public Paddle(PaddleSide side, int width, int height, int xCoordinate, int yCoordinate) {
        this.side = side;
        this.shape = new Rectangle(width, height);
        this.position = new Coordinates(xCoordinate, yCoordinate);
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
