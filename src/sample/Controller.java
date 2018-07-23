package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.System.exit;


public class Controller implements Initializable {

    @FXML
    private TextField addressBar;
    @FXML
    private WebView web;
    @FXML
    private Button GO;
    @FXML
    private Button exit;
    @FXML
    private ProgressIndicator progress;

    private String htLink = "http://";
    private String adrsLink;
    private WebEngine engine;



    @FXML
    private void go(ActionEvent event) { // actiunea butonului "go"
        progress.setProgress(-1);
        adrsLink = addressBar.getText();
        engine.load(htLink + adrsLink);
    }


    @FXML
    private void goEnter(ActionEvent event) { // actiunea butonului "Enter" in text
        progress.setProgress(-1);
        adrsLink = addressBar.getText();
        engine.load(htLink + adrsLink);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { // initializarea cu site-ul "google"
        progress.setProgress(-1);
        engine = web.getEngine();
        engine.load(htLink + "www.google.com");
    }

    @FXML
    private void onExit(ActionEvent event){
        exit(0);
    }
}


