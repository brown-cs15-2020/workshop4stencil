package workshop4stencil;

import javafx.scene.layout.Pane;

/**
 * Organizes GUI layout for bouncing ball.
 */
public class PaneOrganizer {
    private Pane root;

    public PaneOrganizer() {
        this.root = new Pane();
        new BouncingBall(this.root);
    }

    public Pane getRoot() {
        return this.root;
    }
}

