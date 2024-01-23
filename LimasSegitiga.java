/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author rafia
 */
public class LimasSegitiga {

    double la, tl;

    double volume() {
        double volume = 1.0 / 3.0 * la * tl;
        System.out.println("Volume Limas Segitiga : " + volume + "cm3");
        return volume;
    }
}