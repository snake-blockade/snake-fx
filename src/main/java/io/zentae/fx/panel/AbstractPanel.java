package io.zentae.fx.panel;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractPanel extends JPanel {

    /**
     * Returns a component of this panel by its name. if multiple components with the same name exist, returns the first one found.
     * @param name the name of the component.
     * @return a <code>{@link Component}</code> that matches the given name, otherwise null.
     */
    @Nullable
    public Component getComponent(@Nonnull String name) {
        for(Component component : getComponents()) {
            // the null check of the name is needed here, otherwise I'm getting a NPE as JavaFX forgot to declare a default name.
            if(component.getName() != null && component.getName().equals(name))
                return component;
        }
        return null;
    }

    /**
     * Returns a component of this panel by its name. if multiple components with the same name exist, returns the first one found.
     * @param name the name of the component.
     * @param type the type to which we want our component to be cast.
     * @return a <code>{@link Component}</code> that matches the given name, otherwise null.
     */
    @Nullable
    public <T extends Component> T getComponent(@Nonnull String name, @Nonnull Class<T> type) {
        // get component.
        Component component = this.getComponent(name);
        return component == null ? null : type.cast(component);
    }

}
