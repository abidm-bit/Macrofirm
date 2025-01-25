module dema {
    requires javafx.controls;
    requires transitive javafx.graphics;
    requires javafx.fxml;
    requires java.sql;
    opens dema to javafx.fxml;
    exports dema;
}
