/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mover_imagen;

import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public class MuerteMago extends MuertePersonaje{

    public MuerteMago(JPanel panel) {
        super(panel);
    }

    @Override
    public void aniMuertePer() {
        numeroInicial = 17;
        numeroFinal = 19;
        
    }

    @Override
    public void run() {
    }
    @Override
    public MuertePersonaje clone(){
        MuertePersonaje figura = new MuerteMago(panel);       
        return figura;
    }
}
