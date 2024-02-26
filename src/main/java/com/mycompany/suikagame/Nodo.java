
package com.mycompany.suikagame;

public class Nodo {
    //Atributos de la clase nodo
    private Fruta valor;
    private Nodo siguiente;
    
    //Constructor
    public Nodo(Fruta valor){
        this.valor = valor;
        this.siguiente = null;
    }

    public Fruta getValor() {
        return valor;
    }

    public void setValor(Fruta valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
