/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FindYourFavs.gui.controller;

import FindYourFavs.bll.Manager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author mac
 */
public class FXMLDocumentController implements Initializable {
    
    Manager manager = new Manager();

    @FXML
    private Label label;
    @FXML
    private MenuButton categories;
    @FXML
    private Button addmovie;
    @FXML
    private Button deletemovie;
    @FXML
    private Button addcategory;
    @FXML
    private Button deletecategory;
    @FXML
    private Button addrating;
    @FXML
    private Button editrating;
    @FXML
    private TableColumn<?, ?> movietittle;
    @FXML
    private TableColumn<?, ?> usrrating;
    @FXML
    private TableColumn<?, ?> imdbrating;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
       
    }    

    @FXML
    private void clickActionCategory(ActionEvent event) {
    }

    @FXML
    private void clickAnimationCategory(ActionEvent event) {
    }

    @FXML
    private void clickComedyCategory(ActionEvent event) {
    }

    @FXML
    private void clickCrimeCategory(ActionEvent event) {
    }

    @FXML
    private void clickDramaCategory(ActionEvent event) {
    }

    @FXML
    private void clickFilmNoir(ActionEvent event) {
    }

    @FXML
    private void clickHorror(ActionEvent event) {
    }

    @FXML
    private void clickThriller(ActionEvent event) {
    }

    @FXML
    private void clickWar(ActionEvent event) {
    }

    @FXML
    private void clickWestern(ActionEvent event) {
    }

    @FXML
    private void clickaddmovie(ActionEvent event) {
    }

    @FXML
    private void clickdeletemovie(ActionEvent event) {
    }

    @FXML
    private void clickaddcategory(ActionEvent event) {
    }

    @FXML
    private void clickdeletecategory(ActionEvent event) {
    }

    @FXML
    private void clickAddRating(ActionEvent event) {
    }

    @FXML
    private void clickEditRating(ActionEvent event) {
    }
    
}
