/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsimulator;

import Interfaces.IHotelLayoutProcessor;
import Interfaces.IVorm;
import java.awt.Point;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import views.HotelViewController;

/**
 *
 * @author Mollaiedaryani
 */
public final class HotelController implements IHotelLayoutProcessor {
    
    private Stage stage;
    private FactoryProducerElements hotel;
    private HotelViewController uitzicht;
    public Map<String, IVorm> hotelplattegrond = new HashMap<>();

    public HotelController(Stage stage) {
        this.stage = stage;
    }
    public HotelController(){}

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public FactoryProducerElements getHotel() {
        return hotel;
    }

    public void setHotel(FactoryProducerElements hotel) {
        this.hotel = hotel;
    }

    public HotelViewController getUitzicht() {
        return uitzicht;
    }

    public void setUitzicht(HotelViewController uitzicht) {
        this.uitzicht = uitzicht;
    }


    void start(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/HotelView.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException ex) {
            Logger.getLogger(HotelController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        setController(scene);
    }
    
    // het maken van een nieuw vorm
    public IVorm getVorm(String object){
        AbstractHotelElementsFactory factory = FactoryProducerElements.getFactory("vorm");
        return factory.getVorm(object);
    }
    
    @Override
    public void processHotelLayout(String hotelLayout) {
        JsonReader jsonReader = new JsonReader();

        JSONArray getJsonData = jsonReader.getJsonData(hotelLayout);

        hotelMapper(getJsonData);
    }

    private void hotelMapper(JSONArray getJsonData) {
        JSONObject jsonObject;
        Bioscoop bioscoop;
        Eetzaal eetzaal;
        FitnessRuimte fitness;
        Kamer room;

        if(getJsonData != null) {
            Iterator it = getJsonData.iterator();
            while (it.hasNext()) {
                jsonObject = (JSONObject) it.next();
                var dimentieFormat = jsonObject.get("Dimension").toString().replaceAll("\\s", "");

                var positieFormat = jsonObject.get("Position").toString().replaceAll("\\s", "");


                var dimentieCoordinaten = dimentieFormat.split(",");
                var positieCoordinaten = positieFormat.split(",");

                var xDimentie = Integer.parseInt(dimentieCoordinaten[0]);
                var yDimentie = Integer.parseInt(dimentieCoordinaten[1]);
                var xPositie = Integer.parseInt(positieCoordinaten[0]);
                var yPositie = Integer.parseInt(positieCoordinaten[1]);

                if (jsonObject.get("AreaType").toString().equals("Cinema")) {
                    bioscoop = (Bioscoop) getVorm("Cinema");
                    bioscoop.setDimentie(new Point(xDimentie, yDimentie));
                    bioscoop.setPositie(new Point(xPositie, yPositie));
                    hotelplattegrond.put("Cinema", bioscoop);

                } else if (jsonObject.get("AreaType").toString().equals("Restaurant")) {
                    bioscoop = (Bioscoop) getVorm("Cinema");
                    bioscoop.setDimentie(new Point(xDimentie, yDimentie));
                    bioscoop.setPositie(new Point(xPositie, yPositie));
                    hotelplattegrond.put("Cinema", bioscoop);

                } else if (jsonObject.get("AreaType").toString().equals("Fitness")) {
                    bioscoop = (Bioscoop) getVorm("Cinema");
                    bioscoop.setDimentie(new Point(xDimentie, yDimentie));
                    bioscoop.setPositie(new Point(xPositie, yPositie));
                    hotelplattegrond.put("Cinema", bioscoop);

                } else if (jsonObject.get("AreaType").toString().equals("Fitness")) {
                    bioscoop = (Bioscoop) getVorm("Cinema");
                    bioscoop.setDimentie(new Point(xDimentie, yDimentie));
                    bioscoop.setPositie(new Point(xPositie, yPositie));
                    hotelplattegrond.put("Cinema", bioscoop);
                }
            }
        }

        //test mapper

    }


    public void setController(Scene scene) {
        uitzicht = scene.lookup("#uitzicht");
    }
}
