package com.example.demo1;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import com.example.demo1.parseCurse.CurseFromPrivat;
import com.example.demo1.parseCurse.JSON;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ExampleController {

@FXML
private ResourceBundle resources;

@FXML
private URL location;

@FXML
private Button ButtonShowData;

@FXML
private Text textExample;

@FXML
private AnchorPane detailsArea;

@FXML
private Font x1;

@FXML
private Color x2;

@FXML
private Font x3;

@FXML
private Color x4;

@FXML
void initialize() {
	assert ButtonShowData != null : "fx:id=\"ButtonShowData\" was not injected: check your FXML file 'example.fxml'.";
	assert textExample != null : "fx:id=\"textExample\" was not injected: check your FXML file 'example.fxml'.";
	assert detailsArea != null : "fx:id=\"detailsArea\" was not injected: check your FXML file 'example.fxml'.";
	assert x1 != null : "fx:id=\"x1\" was not injected: check your FXML file 'example.fxml'.";
	assert x2 != null : "fx:id=\"x2\" was not injected: check your FXML file 'example.fxml'.";
	assert x3 != null : "fx:id=\"x3\" was not injected: check your FXML file 'example.fxml'.";
	assert x4 != null : "fx:id=\"x4\" was not injected: check your FXML file 'example.fxml'.";

}

@FXML
protected void onShowDataButtonClick(ActionEvent event){

	//TextView.setText(TextView.getText() + "\nSome Text");

	JSON[] jsons = new CurseFromPrivat().getCurse();
	String text = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "";
	for (int i = 0; i < jsons.length; i++) {
		text += "\n\n" +
				"Валюта        Купівля    Продаж\n" +
				jsons[i].ccy + " / " + jsons[i].base_ccy + "    " + jsons[i].buy + "    " + jsons[i].sale;
	}
	textExample.setText(text);
}

}