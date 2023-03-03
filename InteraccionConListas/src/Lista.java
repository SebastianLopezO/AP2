/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interaccionconlistas;

import javax.swing.JOptionPane;

/**
 *
 * @author sala304
 */
public class Lista {

    //Atributos
    public Nodo Punta;

    //Constructor
    public Lista() {
        this.Punta = null;
    }

    //Get's and Set's
    public Nodo getPunta() {
        return Punta;
    }

    public void setPunta(Nodo Punta) {
        this.Punta = Punta;
    }

    //Metodos
    public void InsertStart() {

    }

    public void InsertEnd(int Dato) {
        Nodo P, X = new Nodo(Dato);

        if (Punta == null) {
            Punta = X;
        }else{
            P = Punta;
            while (P.getLiga() != null) {
                P = P.getLiga(); //Avance de Liga
            }
            P.setLiga(X);
        }
        
    }

    public void Show() {
        String msj = "[ ";
        Nodo P;
        for (P = this.Punta; P != null; P = P.getLiga()) {
            msj += "| " + P.getDato() + " | " + P.getLiga() + " |  => ";
        }
        msj += " ]";
        JOptionPane.showMessageDialog(null, msj);

    }

}
