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
import workshop4solution.Constants;

/**
 * FILL IN THIS CLASS FOR DEMO
 * Top-level logical class of our program, contains timeline of bouncing ball.
 */
public class BouncingBall {
    private Ball ball;
    private Pane demoPane;

    public BouncingBall(Pane demoPane) {
        this.demoPane = demoPane;
        // TODO: create a rectangle for the ground
        this.ball = new Ball(demoPane);
        this.setUpTimeline();
    }

    private void setUpTimeline() {
        KeyFrame kf = new KeyFrame(Duration.seconds(Constants.DURATION), (ActionEvent e) ->this.updateBall());
        Timeline timeline = new Timeline(kf);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private void updateBall(){
        // TODO: the ball should set its own position and velocity

    }




}