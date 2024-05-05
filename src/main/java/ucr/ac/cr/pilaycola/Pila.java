/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ucr.ac.cr.pilaycola;

/**
 *
 * @author Usuario
 */
public class Pila<T> {

    private Nodo<T> cima;

    public void vacia() {
        cima = null;
    }
 
    public T cima() {
        if (!esVacia()) {
            return cima.getDato();
        }
        return null;
    }

    public T desapila() {
        T elemento = null;
        if (!esVacia()) {
            elemento = cima.getDato();
            cima = cima.getSiguiente();
            
        }
        return elemento;
    }

    public void apila(T dato) {

        Nodo<T> nuevo = new Nodo<T>(dato);
        nuevo.setSiguiente(cima);
        this.cima = nuevo;
    }

    public boolean esVacia() {
        return cima == null;
    }

}
