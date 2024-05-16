module com.codigonline.poyectogit {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.codigonline.poyectogit to javafx.fxml;
    exports com.codigonline.poyectogit;
}