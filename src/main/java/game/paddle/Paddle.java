package game.paddle;

import utilities.Utilities;

public class Paddle {
    private int position;
    private PaddleSide side;

    private Utilities util = new Utilities();

    public Paddle(PaddleSide side) {
        this.side = side;
        this.position = 0;
    }

    public void moveUp() {
        if (util.isInArea(position)) {
            this.position++;
        }
    }

    public void moveDown() {
        if (util.isInArea(position)) {
            this.position--;
        }
    }

    public int getPosition() {
        return position;
    }
}
