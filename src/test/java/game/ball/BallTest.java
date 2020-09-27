package game.ball;

import game.Direction;
import game.gameArea.GameArea;
import org.junit.Assert;
import org.junit.Test;
import utilities.Utilities;

public class BallTest {

    @Test
    public void testIsBallInArea() {

        // Given
        Utilities util = new Utilities();
        GameArea gameArea = new GameArea();
        Ball ball = new Ball(gameArea.getRight() / 2, gameArea.getTop() / 2,  5);

        // When
        util.isInArea(ball.getPosition().getYCoordinate());

        //Then
        Assert.assertTrue(util.isInArea(ball.getPosition().getYCoordinate()));
    }

    @Test
    public void testMoveUp() {

        // Given
        GameArea gameArea = new GameArea();
        Ball ball = new Ball(gameArea.getRight() / 2, gameArea.getTop() / 2,  5);

        // When
        ball.move(Direction.UP);

        // Then
        Assert.assertEquals(51, ball.getPosition().getYCoordinate());
    }

    @Test
    public void testMoveDown() {

        // GivenmoveDown
        GameArea gameArea = new GameArea();
        Ball ball = new Ball(gameArea.getRight() / 2, gameArea.getTop() / 2,  5);

        // When
        ball.move(Direction.DOWN);

        // Then
        Assert.assertEquals(49, ball.getPosition().getYCoordinate());
    }

    @Test
    public void testMoveLeft() {

        // Given
        GameArea gameArea = new GameArea();
        Ball ball = new Ball(gameArea.getRight() / 2, gameArea.getTop() / 2,  5);

        // When
        ball.move(Direction.LEFT);

        // Then
        Assert.assertEquals(49, ball.getPosition().getXCoordinate());
    }

    @Test
    public void testMoveRight() {

        // Given
        GameArea gameArea = new GameArea();
        Ball ball = new Ball(gameArea.getRight() / 2, gameArea.getTop() / 2,  5);

        // When
        ball.move(Direction.RIGHT);

        // Then
        Assert.assertEquals(51, ball.getPosition().getXCoordinate());
    }
}
