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
public class Eetzaal implements IVorm {
    
    private final Color kleur;
    private Point dimentie;
    private int capaciteit;
    public boolean vol;
//    private final String gebied;
    private Point positie;

//    public Eetzaal(Point positie, Point dimentie, int capaciteit, boolean vol) {
//        this.kleur = Color.ORANGE;        
//        this.dimentie = dimentie;
//        this.capaciteit = capaciteit;
//        this.vol = vol;
//        this.gebied = "Eetzaal";
//        this.positie = positie;
//    }

    public Eetzaal() {
        this.kleur = Color.ORANGE;        
    }
        
//    public String getGebied() {
//        return gebied;
//    }

    public Point getDimentie() {
        return dimentie;
    }

    public void setDimentie(Point dimentie) {
        this.dimentie = dimentie;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }

    public Point getPositie() {
        return positie;
    }

    public void setPositie(Point positie) {
        this.positie = positie;
    }

    public boolean isVol() {
        return vol;
    }

    public void setVol(boolean vol) {
        this.vol = vol;
    }

    public Color getKleur() {
        return kleur;
    }
    
    @Override
    public void teken() {   
        System.out.print(this);
    }

}
