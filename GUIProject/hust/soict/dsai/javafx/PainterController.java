package GUIProject.hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {


    @FXML
    private Pane drawingAreaPane;

    @FXML
    private RadioButton eraserRadioButton;

    @FXML
    private RadioButton penRadioButton;

    @FXML
    private ToggleGroup toolsToggleGroup;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (toolsToggleGroup.getSelectedToggle() == null || toolsToggleGroup.getSelectedToggle() == penRadioButton) {
            Circle penCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
            drawingAreaPane.getChildren().add(penCircle);
        } else if (toolsToggleGroup.getSelectedToggle() == eraserRadioButton) {
            Circle eraseCircle = new Circle(event.getX(), event.getY(), 8, Color.WHITE);
            drawingAreaPane.getChildren().add(eraseCircle);
        }
        
    }
}
