package game;

import game.ball.Ball;
import game.paddle.Paddle;
import game.paddle.PaddleSide;

public class Game {

    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private Ball ball;

    public Game() {
        this.leftPaddle = new Paddle(PaddleSide.LEFT, 5, 10, 5, 0);
        this.rightPaddle = new Paddle(PaddleSide.RIGHT, 5, 10, 195, 0);
        this.ball = new Ball(100, 0, 5);
    }
}
