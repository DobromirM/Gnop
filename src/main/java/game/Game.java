package game;

import game.ball.Ball;
import game.gameArea.GameArea;
import game.paddle.Paddle;
import game.paddle.PaddleSide;

public class Game {

    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private Ball ball;
    private GameArea gameArea;

    public Game() {
        this.gameArea = new GameArea();
        this.leftPaddle = new Paddle(PaddleSide.LEFT, 5, 10, gameArea.getLeft() + 5, gameArea.getTop() / 2);
        this.rightPaddle = new Paddle(PaddleSide.RIGHT, 5, 10, gameArea.getRight() - 5, gameArea.getTop() / 2);
        this.ball = new Ball(gameArea.getRight() / 2, gameArea.getTop() / 2,  5);
    }
}
