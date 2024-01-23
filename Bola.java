/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author rafia
 */
public class Bola {

    double r;

    double volume() {
        double volume = 4.0 / 3.0 * 3.14 * r * r * r;
        System.out.println("Volume Bola : " + volume + "cm3");
        return volume;
    }
}
