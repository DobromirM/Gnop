package game;

import game.paddle.Paddle;
import game.paddle.PaddleSide;

public class Game {

    private Paddle left_paddle;
    private Paddle right_paddle;

    public Game() {
        this.left_paddle = new Paddle(PaddleSide.LEFT);
        this.right_paddle = new Paddle(PaddleSide.RIGHT);
    }
}
