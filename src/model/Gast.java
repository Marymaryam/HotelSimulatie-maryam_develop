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
public class Gast implements IVorm {
    
    private final Color kleur;
//    private final String naam;
    private Point positie;
    private boolean klokken;
    private int voorkeur;
    private int id;

//    public Gast(Point positie, boolean klokken, int voorkeur, int id) {
//        this.kleur = Color.DEEPPINK; 
//        this.naam = "Gast";
//        this.positie = positie;
//        this.klokken = klokken;
//        this.voorkeur = voorkeur;
//        this.id = id;
//    }
    
    public Gast() {
        this.kleur = Color.DEEPPINK; 
    }    

//    public String getNaam() {
//        return naam;
//    }

    public Point getPositie() {
        return positie;
    }

    public void setPositie(Point positie) {
        this.positie = positie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVoorkeur() {
        return voorkeur;
    }

    public void setVoorkeur(int voorkeur) {
        this.voorkeur = voorkeur;
    }

    public boolean isKlokken() {
        return klokken;
    }

    public void setKlokken(boolean klokken) {
        this.klokken = klokken;
    }

    public Color getKleur() {
        return kleur;
    }

    @Override
    public void teken() {
        System.out.print(this);
    }
}
