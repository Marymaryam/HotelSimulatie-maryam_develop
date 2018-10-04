/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Interfaces.IBeweging;
import Interfaces.ITijd;
import Interfaces.IVorm;

/**
 *
 * @author Mollaiedaryani
 */
public class VormFactory extends AbstractHotelElementsFactory{

    public VormFactory() {
    }

    @Override
    public IVorm getVorm(String vorm){
        
        if(vorm == null){
            return null;
        }
        if(vorm.equalsIgnoreCase("Cinema")){
            return new Bioscoop();
        } else if(vorm.equalsIgnoreCase("Restaurant")){
            return new Eetzaal();
        } else if(vorm.equalsIgnoreCase("Fitness")){
            return new FitnessRuimte();
        } else if(vorm.equalsIgnoreCase("Room")){
            return new Kamer();
        } else if(vorm.equalsIgnoreCase("Lift")){
            return new Lift();
        } else if(vorm.equalsIgnoreCase("Lobby")){
            return new Lobby();
        } else if(vorm.equalsIgnoreCase("Gast")){
            return new Gast();
        } else if(vorm.equalsIgnoreCase("Schoonmaker")){
            return new Schoonmaker();
        } else if(vorm.equalsIgnoreCase("Trap")){
            return new Trap();
        }
        return null;
    }

    @Override
    public ITijd getHET() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IBeweging getBeweging() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
