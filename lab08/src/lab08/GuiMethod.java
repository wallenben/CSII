package lab08;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 * Class for displaying numerous logos using JavaFX
 * 
 * @author Ben Wallen
 * @version 2021.03.23
 */
public class GuiMethod extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// mastercard
			Circle red = new Circle(85, 75, 50);
			red.setFill(Color.RED);
			Circle orange = new Circle(145, 75, 50);
			orange.setFill(Color.ORANGE);
			Text master = new Text(45, 85, "MasterCard");
			Font timesNewRoman = Font.font("Times New Roman", FontPosture.ITALIC, 28);
			master.setFont(timesNewRoman);
			master.setFill(Color.WHITE);
			Group masterCard = new Group(red, orange, master);
			masterCard.setTranslateY(200);
			// visa
			Rectangle whiteRectangle = new Rectangle(0, 0, 150, 100);
			whiteRectangle.setFill(Color.WHITE);
			Rectangle blueRectangle = new Rectangle(0, 0, 150, 30);
			blueRectangle.setFill(Color.BLUE);
			Rectangle orangeRectangle = new Rectangle(0, 70, 150, 30);
			orangeRectangle.setFill(Color.ORANGE);
			Text visa = new Text(33, 65, "VISA");
			Font fontVisa = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40);
			visa.setFont(fontVisa);
			visa.setFill(Color.BLUE);
			Group visaGroup = new Group(whiteRectangle, blueRectangle, orangeRectangle, visa);
			visaGroup.setTranslateX(300);
			visaGroup.setTranslateY(350);
			// walmart
			Text walmartText = new Text(0, 54, "Walmart");
			Font walmartFont = Font.font("Courier", 50);
			walmartText.setFont(walmartFont);
			walmartText.setFill(Color.CORNFLOWERBLUE);
			Text walmartText2 = new Text(0, 75, "Save money, Live better.");
			Font walmartFont2 = Font.font("Courier", 18);
			walmartText2.setFont(walmartFont2);
			walmartText2.setFill(Color.CORNFLOWERBLUE);
			// walmart flower
			Line walmartLine1 = new Line(250, 5, 250, 20);
			walmartLine1.setStrokeWidth(6);
			walmartLine1.setStroke(Color.ORANGE);
			Line walmartLine2 = new Line(250, 50, 250, 65);
			walmartLine2.setStrokeWidth(6);
			walmartLine2.setStroke(Color.ORANGE);
			Line walmartLine3 = new Line(250, 20, 250, 35);
			walmartLine3.setStrokeWidth(6);
			walmartLine3.setStroke(Color.ORANGE);
			walmartLine3.setRotate(60);
			walmartLine3.setTranslateX(20);
			walmartLine3.setTranslateY(-3);
			Line walmartLine4 = new Line(250, 50, 250, 65);
			walmartLine4.setStrokeWidth(6);
			walmartLine4.setStroke(Color.ORANGE);
			walmartLine4.setRotate(120);
			walmartLine4.setTranslateX(20);
			walmartLine4.setTranslateY(-10);
			Line walmartLine5 = new Line(250, 20, 250, 35);
			walmartLine5.setStrokeWidth(6);
			walmartLine5.setStroke(Color.ORANGE);
			walmartLine5.setRotate(-60);
			walmartLine5.setTranslateX(-20);
			walmartLine5.setTranslateY(-3);
			Line walmartLine6 = new Line(250, 50, 250, 65);
			walmartLine6.setStrokeWidth(6);
			walmartLine6.setStroke(Color.ORANGE);
			walmartLine6.setRotate(-120);
			walmartLine6.setTranslateX(-20);
			walmartLine6.setTranslateY(-10);
			Group walmartFlower = new Group(walmartLine1, walmartLine2, walmartLine3, walmartLine4, walmartLine5,
					walmartLine6);
			walmartFlower.setTranslateX(-25);
			Group walmart = new Group(walmartText, walmartText2, walmartFlower);
			walmart.setTranslateX(240);
			walmart.setTranslateY(100);
			// amazon
			Text amazonText = new Text(0, 54, "amazon");
			Font amazonFont = Font.font("Courier", FontWeight.BOLD, 46);
			amazonText.setFont(amazonFont);
			// amazon arcs
			Arc amazonArc1 = new Arc(70, 10, 80, 60, 240, 50);
			amazonArc1.setFill(Color.ORANGE);
			Arc amazonArc2 = new Arc(100, 65, 20, 6, 60, 65);
			amazonArc2.setFill(Color.ORANGE);
			Arc amazonArc3 = new Arc(90, 60, 20, 25, 320, 40);
			amazonArc3.setFill(Color.ORANGE);
			Group amazonArcs = new Group(amazonArc1, amazonArc2, amazonArc3);
			Group amazon = new Group(amazonArcs, amazonText);
			amazon.setTranslateX(20);
			amazon.setTranslateY(20);
			Group root = new Group(masterCard, visaGroup, walmart, amazon);
			Scene scene = new Scene(root, 500, 500, Color.ANTIQUEWHITE);

			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}