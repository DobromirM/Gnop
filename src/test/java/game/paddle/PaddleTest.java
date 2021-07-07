package game.paddle;

import game.Direction;
import game.gameArea.GameArea;
import org.junit.Assert;
import org.junit.Test;
import utilities.Utilities;

public class PaddleTest {

    @Test
    public void testMoveUp() {

        // Given
        GameArea gameArea = new GameArea();
        Paddle paddle = new Paddle(PaddleSide.LEFT, 5, 10, gameArea.getLeft() + 5, gameArea.getTop() / 2);

        //When
        paddle.move(Direction.UP);

        //Then
        Assert.assertEquals(51, paddle.getPosition().getYCoordinate());
    }

    @Test
    public void testMoveDown() {

        //Given
        GameArea gameArea = new GameArea();
        Paddle paddle = new Paddle(PaddleSide.LEFT, 5, 10, gameArea.getLeft() + 5, gameArea.getTop() / 2);

        //When
        paddle.move(Direction.DOWN);

        //Then
        Assert.assertEquals(49, paddle.getPosition().getYCoordinate());
    }

    @Test
    public void testIsPaddleInArea() {

        // Given
        Utilities util = new Utilities();
        GameArea gameArea = new GameArea();
        Paddle paddle = new Paddle(PaddleSide.LEFT, 5, 10, gameArea.getLeft() + 5, gameArea.getTop() / 2);

        // When
        util.isInArea(paddle.getPosition().getYCoordinate());

        //Then
        Assert.assertTrue(util.isInArea(paddle.getPosition().getYCoordinate()));
    }
}
