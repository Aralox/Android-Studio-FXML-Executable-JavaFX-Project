package com.example;
//http://javajdk.net/tutorial/javafx-8-hello-world-for-eclipse/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloWorldController {

    @FXML // fx:id="helloBtn"
    private Button helloBtn; // Value injected by FXMLLoader

    @FXML // fx:id="helloTF"
    private TextField helloTF; // Value injected by FXMLLoader

    @FXML
    void sayHello(ActionEvent event) {
        helloTF.setText( "Hello World!" );
    }

}