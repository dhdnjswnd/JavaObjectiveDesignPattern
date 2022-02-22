package chapter5_strategy.practice4;

public class DiagonalMoveStrategy extends DirectionStrategy {

	@Override
	public void move(Ball ball) {
		ball.setIntervals(Ball.INTERVAL, Ball.INTERVAL);
		while (true) {
			ball.setX(ball.getX() + ball.getxInterval());
			if (ball.getX() < 0 && ball.getxInterval() < 0
					|| ball.getX() + Ball.SIZE > BallFrame.WIDTH - 15 && ball.getxInterval() > 0) {
				ball.setIntervals(-ball.getxInterval(), ball.getyInterval());
			}

			ball.setY(ball.getY() + ball.getyInterval());
			if (ball.getY()  < 0 && ball.getyInterval() < 0
					|| ball.getY() + Ball.SIZE > BallFrame.HEIGHT - 15 && ball.getyInterval() > 0) {
				ball.setIntervals(ball.getxInterval(), -ball.getyInterval());
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
			}
		}

	}

}
