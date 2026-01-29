module eus.ehu.presentation {
    requires javafx.controls;
    requires transitive javafx.graphics;
    requires javafx.fxml;

    opens eus.ehu.presentation to javafx.fxml;
    exports eus.ehu.presentation;
}
