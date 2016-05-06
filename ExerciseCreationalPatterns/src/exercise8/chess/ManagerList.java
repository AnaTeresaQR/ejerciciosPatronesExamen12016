package exercise8.chess;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class that manage a List and its methods
 *
 * @author Kenia Moya
 * @author Victoria Orozco
 * @author Vanessa Bolaños
 * @version 1.0 01/04/2016
 */
public class ManagerList {

    private List<Movement> list = new ArrayList();
    private List<Movement> listTemp;

    private static ManagerList manager = new ManagerList();

    private ManagerList() { //private constructor any class can create an instance of this class
    }

    /**
     * This method creates an instance of the class and return it or return it
     * if is already create
     *
     * @return the singleton instance of the class
     */
    public static ManagerList getInstance() {
        if (manager == null) {
            manager = new ManagerList();
        }
        return manager;
    }

    /**
     * This method add elements to the list
     *
     * @param newMovement the movement to add in the list
     * @throws exercise8.chess.ChessException
     * @throws java.lang.CloneNotSupportedException
     */
    public void add(Movement newMovement) throws ChessException, CloneNotSupportedException {
        listTemp = copyList();
        list.add(newMovement);
    }

    /**
     * This method copy the elements of the list in a new one
     *
     * @throws exercise8.chess.ChessException
     * @return the copy of the movements list
     */
    public List copyList() throws ChessException {
        Iterator<Movement> iterator = list.iterator();
        List<Movement> newList = new ArrayList<>(list.size());

        while (iterator.hasNext()) {
            newList.add(iterator.next().copy());
        }
        return newList;
    }

    /**
     * This method return the list that contains the last status of the game
     *
     * @return the list that contains the last status of the game
     */
    public List backList() {
        return listTemp;
    }

    /**
     * This mtheod return the elements of the list in a string
     *
     * @return the text with the elements of the list
     */
    @Override
    public String toString() {
        Iterator<Movement> iterator = list.iterator();
        String text = "";

        while (iterator.hasNext()) {
            text += iterator.next() + "\n";
        }
        return text;
    }
}
