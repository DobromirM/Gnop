package game.paddle;

import game.ball.Ball;
import org.junit.Assert;
import org.junit.Test;
import utilities.Utilities;

public class PaddleTest {

    @Test
    public void testMoveUp() {

        // Given
        Paddle paddle = new Paddle(PaddleSide.LEFT);

        //When
        paddle.moveUp();

        //Then
        Assert.assertEquals(1, paddle.getPosition());
    }

    @Test
    public void testMoveDown() {

        //Given
        Paddle paddle = new Paddle(PaddleSide.LEFT);

        //When
        paddle.moveDown();

        //Then
        Assert.assertEquals(-1, paddle.getPosition());
    }

    @Test
    public void testIsPaddleInArea() {

        // Given
        Utilities util = new Utilities();
        Paddle paddle = new Paddle(PaddleSide.LEFT);

        // When
        paddle.moveUp();
        util.isInArea(paddle.getPosition());

        //Then
        Assert.assertTrue(util.isInArea(paddle.getPosition()));
    }

    @Test
    public void testIsBallInArea() {

        // Given
        Utilities util = new Utilities();
        Ball ball = new Ball();

        // When
        ball.moveUp();
        util.isInArea(ball.getYCoordinate());

        //Then
        Assert.assertTrue(util.isInArea(ball.getYCoordinate()));
    }
}
