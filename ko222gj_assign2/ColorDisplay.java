package ko222gj_assign2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


@SuppressWarnings("restriction")
public class ColorDisplay extends Application{
	
	@Override
	public void start(Stage primaryStage){
		VBox root = new VBox();
		final HBox color = new HBox();
		color.setPrefSize(200, 200);
		HBox text = new HBox();
		text.setPrefSize(200, 200);
		HBox buttonHolder = new HBox();
		buttonHolder.setPrefSize(200, 200);
		buttonHolder.setAlignment(Pos.CENTER);
		
		VBox left = new VBox();
		final TextField red = new TextField("0");
		red.setPrefSize(90, 30);
		Text r = new Text("Red");
		left.getChildren().addAll(r, red);
		
		VBox mid = new VBox();
		final TextField green = new TextField("0");
		green.setPrefSize(90, 30);
		Text g = new Text("Green");
		mid.getChildren().addAll(g,green);
		
		VBox right = new VBox();
		final TextField blue = new TextField("0");
		right.setPrefSize(90, 30);
		Text b = new Text("Blue");
		right.getChildren().addAll(b,blue);
		
		text.getChildren().addAll(left, mid, right);
		text.setPadding(new Insets(25,25,25,25));
		text.setSpacing(35);
		
		
		Button btn = new Button("Color Display");
		btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				color.setStyle("-fx-background-color: rgb("+check(red.getText())+","+check(green.getText())+"," + check(blue.getText())+");");
			}
			
			private int check(String color) {
				if(color.length() > 3){
					System.out.println("The number should be from 0-255");
					throw new IllegalArgumentException("The number should be from 0-255");
				}else {
					int value = Integer.valueOf(color);
					if (value < 0 || value > 255){
						System.out.println("The number should be from 0-255");
						throw new IllegalArgumentException("The number should be from 0-255");
					}else {
						return value;
					}
				}
			}
		});
		buttonHolder.getChildren().addAll(btn);
		root.getChildren().addAll(color,text, buttonHolder);
		
		primaryStage.setTitle("Color Display");
		primaryStage.setScene(new Scene(root,350,400));
		primaryStage.show();
	    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
