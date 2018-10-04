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
public class Kamer implements IVorm {

    private final Color kleur;
    private int capaciteit;
    private boolean ingebruik;
    private int classificatie;
    private boolean kamerIsLeeg;
    private int id;
//    private final String gebied;
    private Point positie;
    private Point dimentie;

//    public Kamer(Point positie, Point dimentie, boolean ingebruik, int classificatie, boolean kamerisleeg, int id) {
//        this.kleur = Color.WHEAT;   
//        this.capaciteit = 1;
//        this.ingebruik = ingebruik;
//        this.classificatie = classificatie;
//        this.kamerIsLeeg = kamerisleeg;
//        this.id = id;
//        this.gebied = "kamer";
//        this.positie = positie;
//        this.dimentie = dimentie;
//    }
    
    public Kamer() {
        this.kleur = Color.WHEAT;   
    }    

    public int getCapaciteit() {
        return capaciteit;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isKamerIsLeeg() {
        return kamerIsLeeg;
    }

    public void setKamerIsLeeg(boolean kamerIsLeeg) {
        this.kamerIsLeeg = kamerIsLeeg;
    }

    public int getClassificatie() {
        return classificatie;
    }

    public void setClassificatie(int classificatie) {
        this.classificatie = classificatie;
    }

    public boolean isIngebruik() {
        return ingebruik;
    }

    public void setIngebruik(boolean ingebruik) {
        this.ingebruik = ingebruik;
    }

    public Color getKleur() {
        return kleur;
    }
    
    @Override
    public void teken() {
        System.out.print(this);
    }
}
