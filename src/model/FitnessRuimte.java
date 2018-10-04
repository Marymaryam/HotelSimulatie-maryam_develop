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
public class FitnessRuimte implements IVorm {
    
    private final Color kleur;
//    private final String gebied;
    private Point positie;
    private Point dimentie;
    private int capaciteit;

//    public FitnessRuimte(Point positie, Point dimentie, int capaciteit) {
//        this.kleur = Color.AQUAMARINE;        
//        this.gebied = "FitnessRuimte";
//        this.positie = positie;
//        this.dimentie = dimentie;
//        this.capaciteit = capaciteit;
//    }

public FitnessRuimte() {
        this.kleur = Color.AQUAMARINE;        
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

    public Color getKleur() {
        return kleur;
    }
    
    @Override
    public void teken() {
        System.out.print(this);
    }

}
