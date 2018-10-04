/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Interfaces.IVorm;
import java.awt.Point;
import javafx.scene.paint.Color;

/**
 *
 * @author Mollaiedaryani
 */
public class Bioscoop implements IVorm {

    public Point positie;
    public Point dimentie;
    public int capaciteit;
//    private final String gebied;
    private final Color kleur;

//    public Bioscoop(Point positie, Point dimentie, int capaciteit) {
//        this.kleur = Color.RED; 
//        this.gebied = "Bioscoop";        
//        this.positie = positie;
//        this.capaciteit = capaciteit+1; // aantal gasten+1 er is altijd ruimte voor iedereen
//        this.dimentie = dimentie;
//    }
    
    public Bioscoop() {
        this.kleur = Color.RED; 
    }    

//    public String getGebied() {
//        return gebied;
//    }

    public Point getPositie() {
        return positie;
    }

    public void setPositie(Point positie) {
        this.positie = positie;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }

    public Point getDimentie() {
        return dimentie;
    }

    public void setDimentie(Point dimentie) {
        this.dimentie = dimentie;
    }

    public Color getKleur() {
        return kleur;
    }
    
    @Override
    public void teken() {
        System.out.print(this);
        
    }

}
