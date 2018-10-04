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
public class Trap implements IVorm {

    private final Color kleur;
//    private final String gebied;
    private Point positie;
    private Point dimentie;

//    public Trap(Point positie, Point dimentie) {
//        this.kleur = Color.GREEN; 
//        this.gebied = "trap";
//        this.positie = positie;
//        this.dimentie = dimentie;
//    }
    
    public Trap() {
        this.kleur = Color.GREEN; 
    }    

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

    public Color getKleur() {
        return kleur;
    }
    
    @Override
    public void teken() {
        System.out.print(this);
    }

}
