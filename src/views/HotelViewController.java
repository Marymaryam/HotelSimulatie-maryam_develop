/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import hotelsimulator.HotelController;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Path;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Mollaiedaryani
 */
public class HotelViewController implements Initializable  {

    private HotelController controller;
    @FXML
    private Button filechooser;

    @FXML
    private Button kiesHotel;

    @FXML
    private Button afsluiten;

    @FXML
    private ImageView afbeelding;

    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private void HotelSimulator(ActionEvent event) throws IOException{
        
    }
    
    @FXML
    private void Afsluiten(ActionEvent event){
        System.exit(0);
    }
    
    @FXML
    private void bestaandkiezer(ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);
        String hotelFileName = selectedFile.getName();

        controller.processHotelLayout(hotelFileName);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
