/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ucr.ac.cr.pilaycola;

/**
 *
 * @author Usuario
 */
public class Pila {

    private Nodo cima;

    public void vacia() {
        cima = null;
    }
 
    public int cima() {
        if (!esVacia()) {
            return cima.getDato();
        }
        return -1;
    }

    public void desapila() {
        if (!esVacia()) {
            cima = cima.getSiguiente();
        }
    }

    public void apila(int dato) {

        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(cima);
        this.cima = nuevo;
    }

    public boolean esVacia() {
        return cima == null;
    }

}
