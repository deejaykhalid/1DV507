package ko222gj_assign1;
import java.util.Random;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
import javafx.scene.text.Font;
import javafx.scene.text.Text;


@SuppressWarnings("restriction")
public class OneTwoThree extends BorderPane {
		VBox pane = new VBox();
		HBox top = new HBox();
		HBox btn = new HBox();
		final Text text = new Text();
		Font font = Font.font("Font",125);
		Button button = new Button("New Random");
		
		public VBox create() {
			top.setPrefSize(100, 100);
			btn.setPrefSize(100, 100);
			btn.setAlignment(Pos.CENTER);
			text.setFont(font);
			top.getChildren().addAll(text);
			btn.getChildren().addAll(button);
			pane.getChildren().addAll(top,btn);
			
			button.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					text.setText(random() + "");
				}
			});
			return pane;
			
		}
		
		/**
		 * Gets a random number in the range 1-100;
		 * @return randInt.
		 */
		private int random(){
			Random rand = new Random();
			int randInt = rand.nextInt(100) + 1;
			return randInt;
		}
	}
