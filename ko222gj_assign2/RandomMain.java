package ko222gj_assign2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class RandomMain extends Application{
	
	public void start(Stage primaryStage){
		VBox root = new VBox();
		RandomPanel pane = new RandomPanel();
		root.getChildren().addAll(pane.create());
		primaryStage.setTitle("RandomPanel");
		primaryStage.setScene(new Scene(root,400,200));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}
}

