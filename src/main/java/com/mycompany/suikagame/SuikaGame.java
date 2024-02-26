
package com.mycompany.suikagame;

import javax.swing.JFrame;
        
public class SuikaGame {

    public static void main(String[] args) {
        JFrame Ventana = new JFrame("Suika Game");//Se crea una ventana.
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Hace que se pueda cerrar la ventana
        Ventana.setResizable(false); //Hace que no se puede cambiar de tamano la ventana
       
        //Añadir panel de juego a la ventana.
        PanelJuego paneljuego = new PanelJuego();
        Ventana.add(paneljuego);
        Ventana.pack();
        
        Ventana.setLocationRelativeTo(null); //Hace que este centrada la ventana
        Ventana.setVisible(true); //Hace que se vea la ventana
        
        paneljuego.CorrerJuego();
    }
}

