/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ucr.ac.cr.pilaycola;

/**
 *
 * @author Usuario
 */
public class Cola {

    private Nodo primero , ultimo;

    public void vacia() {
        primero = null;
        ultimo = null;
    }

    public int primero() {
        if (!esVacia()) {
           return primero.getDato();
        } 
        return -1;
    }

    public void inserta(int dato) {
        Nodo nuevo = new Nodo(dato);
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
