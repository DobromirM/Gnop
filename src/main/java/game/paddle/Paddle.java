package game.paddle;

public class Paddle {
    private int position;
    private PaddleSide side;

    public Paddle(PaddleSide side) {
        this.side = side;
        this.position = 0;
    }

    public void moveUp() {
        if (isPaddleInArea()) {
            this.position++;
        }
    }

    public void moveDown() {
        if (isPaddleInArea()) {
            this.position--;
        }
    }

    public boolean isPaddleInArea() {
        if (position <= 100 && position >= -100) {
            return true;
        }
        return false;
    }

    public int getPosition() {
        return position;
    }
}
