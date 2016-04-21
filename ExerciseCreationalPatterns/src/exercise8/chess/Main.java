/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8.chess;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class that contains the test of the ManagerList class
 *
 * @author Kenia Moya
 * @author Victoria Orozco
 * @author Vannesa Bolaños
 * @version 1.0 01/04/2016
 */
public class Main {

    /**
     * This method starts the program
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ChessException {
        // TODO code application logic here

        ManagerList manager = ManagerList.getInstance();

        Movement movement1 = new Movement('d', 0, 'k', "blanco");

        Movement movement2 = new Movement('c', 2, 'k', "negro");

        Movement movement3 = new Movement('b', 3, 'k', "blanco");

        Movement movement4 = new Movement('a', 4, 'k', "negro");

        try {
            manager.add(movement4);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            manager.add(movement3);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            manager.add(movement2);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Lista:\n" + manager.toString());

        try {
            manager.add(movement1);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Lista nueva:\n" + manager.toString());

        System.out.println("Estado anterior:\n" + manager.backList().toString());

    }

}
