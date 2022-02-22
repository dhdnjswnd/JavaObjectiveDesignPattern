package chapter5_strategy.practice4;

public class HorizontalMoveStrategy extends DirectionStrategy {

	@Override
	public void move(Ball ball) {
		ball.setIntervals(Ball.INTERVAL, 0);
		while (true) {
			ball.setX(ball.getX() + ball.getxInterval());
			if (ball.getX() - Ball.SIZE < 0 && ball.getxInterval() < 0
					|| ball.getX() + ball.SIZE > BallFrame.WIDTH - 15 && ball.getxInterval() > 0) {
				ball.setIntervals(-ball.getxInterval(), 0);
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
			}
		}

	}

}
