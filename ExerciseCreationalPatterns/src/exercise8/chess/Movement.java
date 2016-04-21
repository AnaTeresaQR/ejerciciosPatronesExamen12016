/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8.chess;

/**
 * Class that represents the movements on a chess board
 *
 * @author Kenia Moya
 * @author Victoria Orozco
 * @author Vanessa Bolaños
 * @version 1.0 01/04/2016
 */
public class Movement implements Cloneable {

    private Character row;
    private int column;
    private Character piece;
    private String sideChess;

    public Movement(Character row, int column, Character piece, String sideChess) {
        this.row = row;
        this.column = column;
        this.piece = piece;
        this.sideChess = sideChess;
    }

    public Movement() {
    }

    public Character getRow() {
        return row;
    }

    public void setRow(Character row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Character getPiece() {
        return piece;
    }

    public String getSideChess() {
        return sideChess;
    }

    @Override
    public String toString() {
        return "Movement " + "row=" + row + ", column=" + column + ", piece=" + piece + ", sideChess=" + sideChess + "\n";
    }

    /**
     * This method copy the elements of the movements
     *
     * @return the copy of the movement
     */
    public Movement copy() {

        Movement aux = new Movement();

        aux.row = row;
        aux.column = column;
        aux.piece = piece;
        aux.sideChess = sideChess;

        return aux;
    }

}
