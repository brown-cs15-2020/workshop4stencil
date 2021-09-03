package workshop4stencil;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

/**
 * Wrapper class of a circle - represents a ball.
 */
public class Ball {

    private Circle ball;

    public Ball(Pane pane) {
        this.ball = new Circle();
        this.ball.setRadius(Constants.BALL_RADIUS);
        this.ball.setCenterX(Constants.SCENE_WIDTH / 2);
        this.ball.setCenterY(Constants.BALL_START_Y);
        pane.getChildren().addAll(this.ball);
    }

    public Circle getBall() {
        return this.ball;
    }

    public void setYLocation(double y) {
        this.ball.setCenterY(y);
    }

    public double getYLocation() {
        return this.ball.getCenterY();
    }
}