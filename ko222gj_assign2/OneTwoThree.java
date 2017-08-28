package ko222gj_assign2;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class OneTwoThree extends Application {

    public void start(Stage primaryStage) {

    	Text one = new Text(10, 40, "One");
        Text two = new Text(230, 160, "Two");
        Text three = new Text(425, 290, "Three");

        Rectangle yellow = new Rectangle(0, 10, 500, 200);
        yellow.setFill(Color.YELLOW);

        Rectangle blue = new Rectangle(0, 100, 500, 300);
        blue.setFill(Color.BLUE);

        Rectangle red = new Rectangle(0, 200, 500, 300);
        red.setFill(Color.RED);

        one.setFont(Font.font("Arial", 25));
        two.setFont(Font.font("Arial", 25));
        three.setFont(Font.font("Arial", 25));

        Group root = new Group();
        root.getChildren().addAll(yellow,blue,red , one, two, three);
        Scene scene = new Scene(root, 500, 300);

        primaryStage.setTitle("One,two,three");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {

        launch(args);
    }
}

        