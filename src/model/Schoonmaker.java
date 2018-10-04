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
public class Schoonmaker implements IVorm {

    private final Color kleur;
    private boolean bezig;
    private int id;
//    private final String naam;
    private Point positie;

//    public Schoonmaker(Point positie, boolean bezig, int id) {
//        this.kleur = Color.NAVY;    
//        this.bezig = bezig;
//        this.naam = "schoonmaker";
//        this.positie = positie;
//    }

    public Schoonmaker() {
        this.kleur = Color.NAVY;    
    }
    
//    public String getNaam() {
//        return naam;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getPositie() {
        return positie;
    }

    public void setPositie(Point positie) {
        this.positie = positie;
    }

    public Color getKleur() {
        return kleur;
    }
        public boolean isBezig() {
        return bezig;
    }

    public void SetBezig(boolean bezig) {
        this.bezig = bezig;
    }

    @Override
    public void teken() {
        System.out.print(this);
    }
}
