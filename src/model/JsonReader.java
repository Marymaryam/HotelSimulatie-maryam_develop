package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {

    private JSONArray jsonArray;

    public JSONArray getJsonData(String hotelFileName) {

        try {
            // read the json file
            FileReader reader = new FileReader(hotelFileName);

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            // get an array from the JSON object
            jsonArray = (JSONArray) jsonObject.get("Hotel");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonArray;
    }

}