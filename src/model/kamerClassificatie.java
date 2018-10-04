/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mollaiedaryani
 */
public enum kamerClassificatie {
   kamerTypeEen("1 Star"),kamerTypeTwee("2 Star"),kamerTypeDrie("3 Star"),kamerTypeVier("4 Star"),kamerTypeVijf("5 Star");
   
   private final String kamerType;
   kamerClassificatie(String kt) {
      kamerType = kt;
   }
   String getType() {
      return kamerType;}

}
