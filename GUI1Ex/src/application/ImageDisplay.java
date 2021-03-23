package application;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageDisplay extends Application {
	public static void main(String[] args) {
			launch(args);
	
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Image img = new Image("eagle.jpg");
		ImageView imgView = new ImageView(img);
		
		//imgView.setViewport(new Rectangle2D(150, 70, 100, 60));

		StackPane pane = new StackPane(imgView);
		pane.setStyle("-fx-background-color: cornsilk");
		
		Scene scene = new Scene (pane, 300, 250);
		
		primaryStage.setTitle("Image Display");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
