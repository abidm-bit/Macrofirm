package dema;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


 
public class App extends Application {
    
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmll = new FXMLLoader(App.class.getResource("Untitled.fxml"));   
        Scene scene = new Scene(fxmll.load());
        Image icon = new Image(getClass().getResourceAsStream("tblogo.png"));
        stage.getIcons().add(icon);
        stage.setTitle("Macrofirm");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    
}




