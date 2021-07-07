package game.ball;

import game.Direction;
import game.coordinates.Coordinates;
import game.shapes.Circle;
import utilities.Utilities;

public class Ball {

    private Coordinates position;
    private Circle shape;
    private Direction moveDirection;
    private int velocity = 1;

    private Utilities util = new Utilities();

    public Ball(int xCoordinate, int yCoordinate, int radius) {
        this.position = new Coordinates(xCoordinate, yCoordinate);
        this.shape = new Circle(radius, this.position);
    }


    public void move(Direction direction) {
        if (util.isInArea(position.getYCoordinate())) {
            if (direction == Direction.UP) {
                this.position.setYCoordinate(position.getYCoordinate() + velocity);
            } else if (direction == Direction.DOWN) {
                this.position.setYCoordinate(position.getYCoordinate() - velocity);
            } else if (direction == Direction.LEFT) {
                this.position.setXCoordinate(position.getXCoordinate() - velocity);
                this.moveDirection = Direction.LEFT;
            } else if (direction == Direction.RIGHT) {
                this.position.setXCoordinate(position.getXCoordinate() + velocity);
                this.moveDirection = Direction.RIGHT;
            }
        }
    }

    public Coordinates getPosition() {
        return position;
    }

    public Direction getMoveDirection() {
        return moveDirection;
    }
}
