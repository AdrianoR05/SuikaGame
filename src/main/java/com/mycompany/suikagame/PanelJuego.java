
package com.mycompany.suikagame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class PanelJuego extends JPanel implements Runnable{
    public static final int ancho = 1280;
    public static final int largo = 720;
    final int fps = 60;
    Thread EjecutarThread;
    ManejadorJuego mj;
    Image fondo = null;
    
    
    public PanelJuego(){
        //Ajustes
        this.setPreferredSize(new Dimension(ancho, largo));
        this.setBackground(Color.black);
        this.setLayout(null);
        //Implementando las teclas
        this.addKeyListener((KeyListener) new KeyHandler());
        this.setFocusable(true);
        
        mj = new ManejadorJuego();
        

    }
    
    public void CorrerJuego() {
        EjecutarThread = new Thread(this);
        EjecutarThread.start();
        
    }

    @Override
    public void run() {
        //Bucle del juego
        double Intervalo = 1000000000/fps;
        double Delta = 0;
        long TiempoAnterior = System.nanoTime();
        long TiempoActual;
        while (EjecutarThread != null){
            TiempoActual = System.nanoTime();
            
            Delta += (TiempoActual - TiempoAnterior)/Intervalo; //No lo sobreescribe sino que lo añade.
            TiempoAnterior = TiempoActual;
            if (Delta >= 1){
                update();
                repaint();
                Delta--;
                
            }
        }
    }
    
    private void update() {
        mj.update();
    }
    
    @Override
    public void paintComponent(Graphics F){
        super.paintComponent(F);
        
        Graphics2D F2 = (Graphics2D)F;
        mj.draw(F2);
        
    }
}
