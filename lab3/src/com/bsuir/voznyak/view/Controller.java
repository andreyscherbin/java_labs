package com.bsuir.voznyak.view;

import com.bsuir.voznyak.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Controller {

    private Brain brain = new Brain(1, 99);
    private Nose nose = new Nose(1, "Кривой");
    private Ear ear = new Ear(1, true);
    private Mouth mouth = new Mouth(1, 20);
    private Stomach stomach = new Stomach(1, 100);

    @FXML
    private Button button;

    @FXML
    private Label resultLabel;

    @FXML
    private ComboBox<String> BrainCombo;

    @FXML
    public void brainControl() {

        String value = BrainCombo.getValue();
        switch (value) {
            case "Нюхать":
                String smell = brain.controlOrgan(nose);
                resultLabel.setText(smell);
                break;
            case "Есть":
                mouth.setStomach(stomach);
                String taste = brain.controlOrgan(mouth);
                resultLabel.setText(taste);
                break;
        }
    }

    @FXML
    public void earControl() {
        String heard = ear.function();
        resultLabel.setText(heard);
    }

    @FXML
    public void noseControl() {
        String feeling = nose.itch();
        resultLabel.setText(feeling);
    }
}
