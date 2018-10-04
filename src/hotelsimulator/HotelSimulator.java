/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsimulator;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Mollaiedaryani
 */
public class HotelSimulator extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        boolean add = stage.getIcons().add(new Image("/views/logo.png"));
        HotelController controller = new HotelController(stage);
        controller.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args); 
    }
   
    
}
