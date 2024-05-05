/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ucr.ac.cr.pilaycola;

/**
 *
 * @author Usuario
 */
public class Cola<T> {

    private Nodo<T> primero , ultimo;

    public void anula() {
        primero = null;
        ultimo = null;
    }

    public T primero() {
        if (!esVacia()) {
           return primero.getDato();
        } 
        return null;
    }

    public void inserta(T dato) {
        Nodo<T> nuevo = new Nodo<T>(dato);
        if (esVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }

    }

    public void quitarPrimero() {
        if (!esVacia()) {
            primero = primero.getSiguiente();
        } 
       
    }

    public boolean esVacia() {
        return primero == null;

    }

}
