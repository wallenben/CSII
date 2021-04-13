package application;

import java.io.File;
import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Main extends Application {
	private Stage window;
	private Text textObject;
	private Font fontObject;
	private FlowPane flowPaneObject;
	private Scene scene1;
	// task 2 variables
	private Image imageObject;
	private ImageView viewObject;
	private Group molePosition;
	private Random randomObj;
	private int scoreVar;
	// audio
	private File fileObj;
	private AudioClip audioObj;

	@Override
	public void start(Stage primaryStage) {
		try {
			window = primaryStage;
			fontObject = new Font("Comic Sans MS", 40);
			textObject = new Text(
					"Whack-a-Mole!\nHit enter to play.\n" + "Click on the mole to move it.\nHit escape to quit.");
			textObject.setFont(fontObject);
			flowPaneObject = new FlowPane();
			flowPaneObject.getChildren().add(textObject);
			scene1 = new Scene(flowPaneObject, 600, 300, Color.LIGHTCYAN);
			scene1.setOnKeyPressed(this::processKeyPress);
			window.setTitle("Whack-a-mole");
			window.setScene(scene1);
			window.show();
			fileObj = new File("pop.wav");
			audioObj = new AudioClip(fileObj.toURI().toString());
			/**
			 * BorderPane root = new BorderPane(); Scene scene = new Scene(root, 400, 400);
			 * scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			 * primaryStage.setScene(scene); primaryStage.show();
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void processKeyPress(KeyEvent e) {
		randomObj = new Random();
		if (e.getCode() == KeyCode.ENTER) {
			// workaround to display image
			File moleObj = new File("mole.png");
			imageObject = new Image(moleObj.toURI().toString());
			viewObject = new ImageView(imageObject);
			viewObject.setOnMouseClicked(this::processMouseClick);
			molePosition = new Group(viewObject);
			Scene scene2 = new Scene(molePosition, 1000, 1000, Color.DARKGREEN);
			scene2.setOnKeyPressed(this::processKeyPress);
			window.setScene(scene2);
			moveMole();
		} else {
			if (e.getCode() == KeyCode.ESCAPE) {
				audioObj.stop();
				textObject.setText("You whacked " + scoreVar + " moles!");
				window.setScene(scene1);
			}
		}
	}

	private void processMouseClick(MouseEvent e) {
		audioObj.play();
		moveMole();
		scoreVar++;
	}

	private void moveMole() {
		int randInt = randomObj.nextInt(800 - 0) + 0;
		viewObject.setTranslateX(randInt);
		viewObject.setTranslateY(randInt);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
