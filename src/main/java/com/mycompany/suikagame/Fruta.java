
package com.mycompany.suikagame;

import java.awt.image.BufferedImage;

public class Fruta {
    private String nombre;
    private int puntos;
    private double diametro;
    private BufferedImage imagen;
    
    public Fruta(String nombre, int puntos, double diametro, BufferedImage imagen){
        this.nombre = nombre;
        this.puntos = puntos;
        this.diametro = diametro;
        this.imagen = imagen;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }
    
    
}
