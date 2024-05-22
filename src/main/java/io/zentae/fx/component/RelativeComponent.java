package io.zentae.fx.component;

import javax.swing.*;

public abstract class RelativeComponent extends JComponent {

    public RelativeComponent(int x, int y, int width, int height) {
        // set the bounds.
        setBounds(x, y, width, height);
    }

}
