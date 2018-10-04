/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Interfaces.IBeweging;
import Interfaces.IVorm;
import Interfaces.ITijd;

/**
 *
 * @author Mollaiedaryani
 */
public abstract class AbstractHotelElementsFactory {

    public abstract ITijd getHET();
    public abstract IBeweging getBeweging();
    public abstract IVorm getVorm(String vorm);
}
