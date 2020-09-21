package game.paddle;

public class Paddle {
    private int position;
    private PaddleSide side;

    public Paddle(PaddleSide side) {
        this.side = side;
        this.position = 30;
    }

    public void moveUp() {
        this.position++;
    }

    public void moveDown() {
        this.position--;
    }

    public int getPosition() {
        return position;
    }
}
