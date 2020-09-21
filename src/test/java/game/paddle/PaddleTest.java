package game.paddle;

import org.junit.Assert;
import org.junit.Test;

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
        Paddle paddle = new Paddle(PaddleSide.LEFT);

        // When
        paddle.isPaddleInArea();

        //Then
        Assert.assertTrue(paddle.isPaddleInArea());
    }
}
