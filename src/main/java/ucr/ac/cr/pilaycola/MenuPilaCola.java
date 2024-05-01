/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.pilaycola;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephanie
 */
public class MenuPilaCola {

    private OperacionesPilaCola operacionesPilaCola;

    public MenuPilaCola() {
        this.operacionesPilaCola = new OperacionesPilaCola();
    }

    public void menu() {
        String opcion = "0";
        String instrucciones = "1. Insertar elementos a la cola.\n"
                + "2. Insertar elementos a la pila.\n"
                + "3. Ordenar cola.\n"
                + "4. Ordenar pila.\n"
                + "5. Mostrar cola.\n"
                + "6. Mostrar pila.\n"
                + "7. Salir.";

        do {
            opcion = JOptionPane.showInputDialog(instrucciones);

            switch (opcion) {
                case "1":
                    this.operacionesPilaCola.insertarCola();
                    break;

                case "2":
                    this.operacionesPilaCola.insertarPila();
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, this.operacionesPilaCola.ordenarCola());
                    break;

                case "4"://Total estudiantes
                    JOptionPane.showMessageDialog(null, this.operacionesPilaCola.ordenarPila());
                    break;

                case "5"://Imprimir todos los datos
                    JOptionPane.showMessageDialog(null, this.operacionesPilaCola.mostrarCola());
                    break;
                case "6"://Salir
                    JOptionPane.showMessageDialog(null, this.operacionesPilaCola.mostrarPila());
                    break;
                case "7"://Salir
                    JOptionPane.showMessageDialog(null, "Thank you!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Numero incorrecto");
            }//Fin switch
        } while (!opcion.equalsIgnoreCase("7"));

    }//Fin del main

    public static void main(String arg[]) {
        MenuPilaCola menu = new MenuPilaCola();
        menu.menu();
    }//Fin del main
}
