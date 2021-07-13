/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Kenji
 */
public class Anjing extends Hewan implements Pet {
    @Override
    public void makan()
    {
        System.out.println("Makan Makana manakan");
    }
    
    @Override
    public void suara(String bunyi)
    {
        System.out.println(bunyi);
    }
}
