/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ucr.ac.cr.pilaycola;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephanie
 */
public class OperacionesPilaCola {

    private Cola<Integer> colaPrincipal, colaAux, colaOrdenada;
    private Pila<Integer> pilaPrincipal, pilaAux, pilaOrdenada;
    private int longitudPila = 10;
    private int longitudCola = 10;

    public OperacionesPilaCola() {
        this.colaPrincipal = new Cola();
        this.colaAux = new Cola();
        this.colaOrdenada = new Cola();
        this.pilaPrincipal = new Pila();
        this.pilaAux = new Pila();
        this.pilaOrdenada = new Pila();
    }

    
    //COLA ********************** COLA *********************** COLA
    public String ordenarCola() { // mayor a menor

        if (!this.colaPrincipal.esVacia()) {

            for (int i = 0; i < longitudCola; i++) { //OJO EL MENOR E IGUAL
                int menor = this.colaPrincipal.primero();

                while (!this.colaPrincipal.esVacia()) {

                    if (this.colaPrincipal.primero() <= menor) {

                        menor = this.colaPrincipal.primero();

                    }
                    this.colaAux.inserta(this.colaPrincipal.primero());
                    this.colaPrincipal.quitarPrimero();
                }

                this.colaOrdenada.inserta(menor);

                while (!this.colaAux.esVacia()) {

                    if (this.colaAux.primero() == menor) {
                        this.colaAux.quitarPrimero();
                    }

                    if (this.colaAux.primero() != null) {
                        this.colaPrincipal.inserta(this.colaAux.primero());//{10}{5}
                    }
                    this.colaAux.quitarPrimero();
                }

            }

            while (!this.colaOrdenada.esVacia()) {

                this.colaPrincipal.inserta(this.colaOrdenada.primero());
                this.colaOrdenada.quitarPrimero();

            }

            return "Ordenado correctamente";
        } else {
            return "La cola esta vacia";
        }
    }

    public void insertarCola() {
        this.colaPrincipal.anula();
        for (int i = 0; i < 10; i++) {
            this.colaPrincipal.inserta((int) (Math.random() * 99) + 1);
        }
    }

    public String mostrarCola() {
        String mensaje = "Cola: ";
        if (!this.colaPrincipal.esVacia()) {

            while (!this.colaPrincipal.esVacia()) {
                mensaje += "[" + this.colaPrincipal.primero() + "] ";
                this.colaAux.inserta(this.colaPrincipal.primero());
                this.colaPrincipal.quitarPrimero();
            }

            while (!this.colaAux.esVacia()) {

                this.colaPrincipal.inserta(this.colaAux.primero());//{10}{5}
                this.colaAux.quitarPrimero();
            }
        }else{
            mensaje += " Esta vacia.";
        }
        return mensaje;
    }

    //PILA ******************** PILA ********************** PILA
    
    public void insertarPila() {
        this.pilaPrincipal.vacia();
        for (int i = 0; i < 10; i++) {
            this.pilaPrincipal.apila((int) (Math.random() * 99) + 1);
        }
    }

    public String ordenarPila() {
        if (!this.pilaPrincipal.esVacia()) {

            for (int i = 0; i < longitudPila; i++) {
                int menor = this.pilaPrincipal.cima();

                while (!this.pilaPrincipal.esVacia()) {

                    if (this.pilaPrincipal.cima() <= menor) {

                        menor = this.pilaPrincipal.cima();

                    }
                    this.pilaAux.apila(this.pilaPrincipal.cima());
                    this.pilaPrincipal.desapila();
                }

                this.pilaOrdenada.apila(menor);

                while (!this.pilaAux.esVacia()) {

                    if (this.pilaAux.cima() == menor) {
                        this.pilaAux.desapila();
                    }

                    if (this.pilaAux.cima() != null) {
                        this.pilaPrincipal.apila(this.pilaAux.cima());//{10}{5}
                    }
                    this.pilaAux.desapila();
                }

            }

            while (!this.pilaOrdenada.esVacia()) {

                this.pilaPrincipal.apila(this.pilaOrdenada.cima());
                this.pilaOrdenada.desapila();

            }
            return "Ordenado correctamente";

        } else {
            return "La cola esta vacia";
        }
    }
    
    public String mostrarPila() {
        String mensaje = "Pila:\n";
        if (!this.pilaPrincipal.esVacia()) {

            while (!this.pilaPrincipal.esVacia()) {
                mensaje += "[" + this.pilaPrincipal.cima()+ "]\n";
                this.pilaAux.apila(this.pilaPrincipal.cima());
                this.pilaPrincipal.desapila();
            }

            while (!this.pilaAux.esVacia()) {

                this.pilaPrincipal.apila(this.pilaAux.cima());//{10}{5}
                this.pilaAux.desapila();
            }
        }else{
            mensaje += " Esta vacia.";
        }
        return mensaje;
    } 
}
