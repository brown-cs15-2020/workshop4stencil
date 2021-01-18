package workshop4stencil;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * FILL IN THIS CLASS FOR DEMO
 * Top-level logical class of our program, contains timeline of bouncing ball.
 */
public class BouncingBall {
    private Ball _ball;
    private Pane _demoPane;

    public BouncingBall(Pane demoPane) {
        _demoPane = demoPane;
        // TODO: create a rectangle for the ground
        _ball = new Ball(demoPane);
        this.setUpTimeline();
    }

    private void setUpTimeline() {
        KeyFrame kf = new KeyFrame(Duration.seconds(Constants.DURATION), new DemoHandler());
        Timeline timeline = new Timeline(kf);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private class DemoHandler implements EventHandler<ActionEvent> {
        private double _velocity;
        public DemoHandler() {
            _velocity = 10;
        }

        @Override
        public void handle(ActionEvent event) {
            this.updateBall();
        }

        private void updateBall() {
            //TODO implement bounce simulation algorithm

        }
    }


}