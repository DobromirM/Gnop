package game.paddle;

import game.ball.Ball;
import org.junit.Assert;
import org.junit.Test;
import utilities.Utilities;

public class PaddleTest {

    @Test
    public void testMoveUp() {

        // Given
        Paddle paddle = new Paddle(PaddleSide.LEFT, 5, 10, 5, 0);

        //When
        paddle.moveUp();

        //Then
        Assert.assertEquals(1, paddle.getPosition().getYCoordinate());
    }

    @Test
    public void testMoveDown() {

        //Given
        Paddle paddle = new Paddle(PaddleSide.LEFT, 5, 10, 5, 0);

        //When
        paddle.moveDown();

        //Then
        Assert.assertEquals(-1, paddle.getPosition().getYCoordinate());
    }

    @Test
    public void testIsPaddleInArea() {

        // Given
        Utilities util = new Utilities();
        Paddle paddle = new Paddle(PaddleSide.LEFT, 5, 10, 5, 0);

        // When
        paddle.moveUp();
        util.isInArea(paddle.getPosition().getYCoordinate());

        //Then
        Assert.assertTrue(util.isInArea(paddle.getPosition().getYCoordinate()));
    }

    @Test
    public void testIsBallInArea() {

        // Given
        Utilities util = new Utilities();
        Ball ball = new Ball(100, 0, 5);

        // When
        ball.moveUp();
        util.isInArea(ball.getPosition().getYCoordinate());

        //Then
        Assert.assertTrue(util.isInArea(ball.getPosition().getYCoordinate()));
    }
}
