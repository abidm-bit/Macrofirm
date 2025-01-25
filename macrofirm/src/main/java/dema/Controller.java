package dema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @SuppressWarnings("CallToPrintStackTrace")
    protected String fetchRandomKeyFromDB() {
        String query = "SELECT key FROM keys ORDER BY RANDOM() LIMIT 1";
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:macrofirm/src/main/java/dema/keys.db");
        
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                return resultSet.getString("key");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; 
    }

    @FXML
    private Label generatedKey;

    @FXML
    protected void genKey(ActionEvent c) {
        String randomKey = fetchRandomKeyFromDB();
        if (randomKey != null) {
            generatedKey.setText(randomKey);
        } else {
            generatedKey.setText("No key available");
        }
    }


}
