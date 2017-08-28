package ko222gj_assign2;

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

@SuppressWarnings("restriction")
public class RandomPanel extends BorderPane {
	/**
	 * Creating a Vbox with 2 Hboxes where the top one conations a text and the bottom one has a button.
	 * @return Vbox.
	 */
	VBox pane = new VBox();
	HBox top = new HBox();
	HBox btn = new HBox();
	final Text text = new Text();
	Font font = Font.font("Font",120);
	Button button = new Button("Random Number");
	
	public VBox create() {
		top.setPrefSize(100, 100);
		btn.setPrefSize(150, 150);
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
