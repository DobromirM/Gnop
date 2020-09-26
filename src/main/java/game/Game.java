package game;

import game.ball.Ball;
import game.gameArea.GameArea;
import game.paddle.Paddle;
import game.paddle.PaddleSide;

import static game.Direction.LEFT;
import static game.Direction.RIGHT;

public class Game {

    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private Ball ball;
    private GameArea gameArea;

    private boolean isRunning;
    private int ballScore;

    public Game() {
        this.gameArea = new GameArea();
        this.leftPaddle = new Paddle(PaddleSide.LEFT, 5, 10, gameArea.getLeft() + 5, gameArea.getTop() / 2);
        this.rightPaddle = new Paddle(PaddleSide.RIGHT, 5, 10, gameArea.getRight() - 5, gameArea.getTop() / 2);
        this.ball = new Ball(gameArea.getRight() / 2, gameArea.getTop() / 2,  5);
    }

    public void startGame() {
        this.isRunning = true;
    }

    public void stopGame() {
        this.isRunning = false;
    }

    public boolean didBallCollide() {
        if (leftPaddle.getPosition().equals(ball.getPosition()) || rightPaddle.getPosition().equals(ball.getPosition())) {
            return true;
        }
        return false;
    }

    public void changeBallDirection() {
        if (ball.getMoveDirection() == LEFT) {
            ball.move(RIGHT);
        } else {
            ball.move(LEFT);
        }
    }

    public boolean isBallBehindPaddle() {
        if (ball.getPosition().getXCoordinate() < leftPaddle.getPosition().getXCoordinate() || ball.getPosition().getXCoordinate() < rightPaddle.getPosition().getXCoordinate()) {
            return true;
        }
        return false;
    }

    public void scoreGoal() {
        this.ballScore++;
    }

    public void createGameLoop() {

        Game Gnop = new Game();
        Gnop.startGame();

        while (isRunning) {

            Gnop.ball.move(LEFT);

            if (didBallCollide()) {
                changeBallDirection();
            }

            if (isBallBehindPaddle()) {
                this.ballScore++;
            }
        }
    }
}
