package application;

import javax.swing.event.HyperlinkEvent.EventType;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * Class for editing inputted text with a variety of buttons.
 * 
 * @author Ben Wallen
 * @version 2021.04.05
 */
public class ColorFactoryPane extends BorderPane {
	private Button redButton, orangeButton, yellowButton;
	private RadioButton greenButton, blueButton, cyanButton;
	private ToggleGroup rbGroup;
	private TextField input;
	private Label instructions;
	private Text output;
	private FlowPane centerPane, topPane, bottomPane;
	private CheckBox boldCheckBox, italicCheckBox, fontCheckBox;
	private Font font;

	public ColorFactoryPane() {
		setupCenterPane();
		setupTopPane();
		setupBottomPane();
		setupRightPane();
		setupLeftPane();

	}

	private void setupCenterPane() {
		font = Font.font("Helvetica", 15);
		output = new Text(
				"Buttons change panel color, \nradio buttons" + " change text color, \ncheck boxes format text input");
		output.setFont(font);
		output.setFill(Color.PURPLE);
		centerPane = new FlowPane(output);
		centerPane.setAlignment(Pos.CENTER);
		setCenter(centerPane);
	}

	private void setupTopPane() {
		instructions = new Label("Type something in and hit enter");
		input = new TextField();
		input.setOnAction(this::processAction);
		topPane = new FlowPane(instructions, input);
		topPane.setAlignment(Pos.CENTER);
		topPane.setHgap(10);
		setTop(topPane);

	}

	private void setupBottomPane() {
		// CheckBox boldCheckBox, italicCheckBox, fontCheckBox;
		boldCheckBox = new CheckBox("Bold");
		boldCheckBox.setOnAction(this::processAction);
		italicCheckBox = new CheckBox("Italic");
		italicCheckBox.setOnAction(this::processAction);
		fontCheckBox = new CheckBox("Change font size");
		fontCheckBox.setOnAction(this::processAction);
		bottomPane = new FlowPane(boldCheckBox, italicCheckBox, fontCheckBox);
		bottomPane.setAlignment(Pos.CENTER);
		bottomPane.setHgap(10);
		setBottom(bottomPane);
		// Task #4 (start here)
	}

	private void setupRightPane() {
		// RadioButton greenButton, blueButton, cyanButton;
		greenButton = new RadioButton("Green");
		greenButton.setStyle("-fx-text-fill: green");
		greenButton.setOnAction(this::processAction);
		blueButton = new RadioButton("Blue");
		blueButton.setStyle("-fx-text-fill: blue");
		blueButton.setOnAction(this::processAction);
		cyanButton = new RadioButton("Cyan");
		cyanButton.setStyle("-fx-text-fill: cyan");
		cyanButton.setOnAction(this::processAction);
		rbGroup = new ToggleGroup();
		greenButton.setToggleGroup(rbGroup);
		blueButton.setToggleGroup(rbGroup);
		cyanButton.setToggleGroup(rbGroup);
		VBox VBox = new VBox(greenButton, cyanButton, blueButton);
		VBox.setSpacing(20);
		Insets z = new Insets(20, 20, 10, 10);
		VBox.setPadding(z);
		setRight(VBox);
	}

	private void setupLeftPane() {
		// Task #6
		// Button redButton, orangeButton, yellowButton;
		redButton = new Button("Red");
		redButton.setStyle("-fx-background-color: red");
		redButton.setOnAction(this::processAction);
		orangeButton = new Button("Orange");
		orangeButton.setStyle("-fx-background-color: orange");
		orangeButton.setOnAction(this::processAction);
		yellowButton = new Button("Yellow");
		yellowButton.setStyle("-fx-background-color: yellow");
		yellowButton.setOnAction(this::processAction);
		VBox VBox2 = new VBox(redButton, orangeButton, yellowButton);
		VBox2.setSpacing(20);
		Insets z2 = new Insets(20, 20, 10, 10);
		VBox2.setPadding(z2);
		setLeft(VBox2);

	}

	private void processAction(ActionEvent event) {
		FontWeight normalWeight = FontWeight.NORMAL;
		FontPosture regularPosture = FontPosture.REGULAR;
		String fontFamily = "Helvetica";
		int fontSize = 25;
		// Task #4 item 2.
		if (boldCheckBox.isSelected()) {
			normalWeight = FontWeight.BOLD;
		}
		if (italicCheckBox.isSelected()) {
			regularPosture = FontPosture.ITALIC;
		}
		if (fontCheckBox.isSelected()) {
			fontSize = 30;
		}
		// Task #5 item 2.
		if (blueButton.isSelected()) {
			output.setFill(Color.BLUE);
		}
		if (greenButton.isSelected()) {
			output.setFill(Color.GREEN);
		}
		if (cyanButton.isSelected()) {
			output.setFill(Color.CYAN);
		}
		// Task #6 item 2.
		if (event.getSource() == redButton) {
			centerPane.setStyle("-fx-background-color: red");
		}
		if (event.getSource() == orangeButton) {
			centerPane.setStyle("-fx-background-color: orange");
		}
		if (event.getSource() == yellowButton) {
			centerPane.setStyle("-fx-background-color: yellow");
		}
		// Task #3

		Font x = Font.font(fontFamily, normalWeight, regularPosture, fontSize);
		output.setFont(x);
		output.setText(input.getText());
	}
}
