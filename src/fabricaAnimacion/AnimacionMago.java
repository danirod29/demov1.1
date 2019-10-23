/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAnimacion;


import javax.swing.JPanel;
import mover_imagen.GolpeMago;
import mover_imagen.GolpePersonaje;
import mover_imagen.MoverPersonaje;
import mover_imagen.MoverMago;
import mover_imagen.MuerteMago;
import mover_imagen.MuertePersonaje;

/**
 *
 * @author Cristian
 */
public class AnimacionMago implements Animacion{

    static JPanel panel;

    public AnimacionMago(JPanel panel) {
        AnimacionMago.panel = panel;
    }
    

    @Override
    public MoverPersonaje moverPersonaje() {
        return  new MoverMago(panel);
    }

    @Override
    public GolpePersonaje golperPersonaje() {
        return  new GolpeMago(panel);
    }

    @Override
    public Animacion clonarMoverPersonaje() {
        Animacion miAnimacion = new AnimacionMago(panel);
        miAnimacion.moverPersonaje();
        return miAnimacion;
    }

    @Override
    public MuertePersonaje muerePersonaje() {
        return new MuerteMago(panel);
    }

    
    
    
    

   
    
    
}
