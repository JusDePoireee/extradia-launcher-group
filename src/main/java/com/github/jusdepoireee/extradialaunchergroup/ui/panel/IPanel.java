package com.github.jusdepoireee.extradialaunchergroup.ui.panel;

import com.github.jusdepoireee.extradialaunchergroup.ui.PanelManager;
import javafx.scene.layout.GridPane;

public interface IPanel {
    void init(PanelManager panelManager);
    GridPane getLayout();
    void onShow();
    String getName();
}
