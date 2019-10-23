/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mover_imagen;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public abstract class MoverPersonaje extends JComponent implements Runnable,Cloneable{
      JPanel panel; 
      int numeroInicial;
      int numeroFinal;
    
    public MoverPersonaje(JPanel panel){  
        this.panel = panel;      
        setBounds(0, 0,panel.getWidth() , panel.getHeight());

    }
    
    @Override
    public void paint(Graphics g) {
        ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource
                          ("imagenes/"+numeroInicial+".png")).getImage());
        
        g.drawImage(imagen.getImage(), 10, 5, 95, 120, null);   
    } 
    
    public abstract void moverDerecha();
    public abstract void moverIzquierda();
    public abstract void moverArriba();
    public abstract void moverAbajo();
    
     Thread hilo = new Thread(){
        
       @Override
        public void run()
        {   
            try
            {
                while(true)
                {
                  numeroInicial++;
                  if(numeroInicial==numeroFinal)
                  {
                    numeroInicial = numeroInicial-2;
                  }
                 panel.repaint();
                 hilo.sleep(500);
                }
                
            } catch (java.lang.InterruptedException ex) {
                    System.out.println(ex.getMessage()); 
                }
        }
    };
    
    public void mover(){
        if(!hilo.isAlive()){
         hilo.start();
       }
    }
    
    @Override
    public MoverPersonaje clone(){
    return null;
    }
        
}
