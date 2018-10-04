/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mollaiedaryani
 */
public class FactoryProducerElements {

    public static  AbstractHotelElementsFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("vorm")){
           return new VormFactory();
        } else if(factory.equalsIgnoreCase("beweging")){
           return new BewegingFactory();
        } else if(factory.equalsIgnoreCase("kleur")){
            return new TijdFactory();
        } else 
            return null;
    }
}
        

    

