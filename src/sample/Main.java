package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
//        Group root = new Group();
//        Label label = new Label("Name:");
//        Text txt  = new Text("Sup?");
//        txt.setFont(new Font("Papyrus", 80));
//        TextField nameField = new TextField();
//        GridPane grid = new GridPane();
//        grid.add(label, 0, 0);
//        Button btn = new Button();
//        grid.add(nameField, 1, 0);
//        grid.add(btn, 1, 1);
//        grid.setHgap(20);
////        grid.setGridLinesVisible(true);
//        btn.setText("Say Sup?");
//        btn.setOnAction(evt -> System.out.printf("Sup %s! %n", nameField.getText()));
//        VBox box = new VBox();
//        txt.setY(50);
//        box.getChildren().addAll(txt, grid);
//        root.getChildren().add(box);
        primaryStage.setTitle("Sup");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
