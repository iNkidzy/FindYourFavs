/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FindYourFavs.gui.controller;

import FindYourFavs.be.Category;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author mac
 */
public class AskAddCategoryController implements Initializable {

    @FXML
    private AnchorPane addcategory;
    @FXML
    private ChoiceBox<?> choicebox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       /*
        // Create ChoiceBox
        ChoiceBox<String>choiceBox = new ChoiceBox<>();
        
        //getItems returns the ObservableList object which u can add items to. 
        choiceBox.getItems().add("Action");
        choiceBox.getItems().add("Animation");
        choiceBox.getItems().addAll("Bat","Box","lol");
        
        //Set value 
        choiceBox.setValue("Action");
        choiceBox.setValue("Animation");
        
      */
        
    }    
    
}
