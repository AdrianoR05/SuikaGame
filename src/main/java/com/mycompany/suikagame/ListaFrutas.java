
package com.mycompany.suikagame;

public class ListaFrutas {
    private Nodo cabeza;
    private int cantidad;
    
    public ListaFrutas(){
        cabeza = null;
        cantidad = 0;
    }
    
    public void AgregarFrutas(Fruta valor){
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else{
            Nodo temp = cabeza;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);
        }
        cantidad++;
    }
    
    public void EliminarFruta(Fruta valor){
        if(estaVacia()){
            return;
        }
        if(cabeza.getValor().equals(valor)){
            cabeza = cabeza.getSiguiente();
            cantidad--;
        }
        Nodo actual = cabeza;
        while(actual.getSiguiente().getValor().equals(valor)){
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            cantidad--;
            return;
        }
        actual = actual.getSiguiente();
    }
    public boolean estaVacia(){
        return cabeza == null;
    }
    
    public Nodo getCabeza() {
        return cabeza;
    }
}
