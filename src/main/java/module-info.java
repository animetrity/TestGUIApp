module com.example.demo1 {
	requires javafx.controls;
	requires javafx.fxml;

	requires org.controlsfx.controls;
	requires com.dlsc.formsfx;
	requires org.kordamp.bootstrapfx.core;
	requires com.fasterxml.jackson.annotation;
	requires com.fasterxml.jackson.core;
	requires com.fasterxml.jackson.databind;

	opens com.example.demo1 to javafx.fxml;
	opens com.example.demo1.parseCurse to javafx.fxml;
	exports com.example.demo1.parseCurse;
	exports com.example.demo1;
}