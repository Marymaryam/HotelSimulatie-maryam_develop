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
public class Lobby implements IVorm {

    private final Color kleur;
//    private final String gebied;
    private Point positie;
    private Point dimentie;

//    public Lobby(Point positie, Point dimentie) {
//        this.kleur = Color.PURPLE;        
//        this.gebied = "lobby";
//        this.positie = positie;
//        this.dimentie = dimentie;
//    }
    
    public Lobby() {
        this.kleur = Color.PURPLE;        
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

    public Color getKleur() {
        return kleur;
    }
    
    @Override
    public void teken() {
        System.out.print(this);
    } 
}
