/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interaccionconlistas;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian Lopez Oosrno
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
    public void InsertStart(int Dato) {
        Nodo P, X = new Nodo(Dato);
        if (Punta == null) {
            Punta = X;
        }else{
            X.setLiga(Punta);
            Punta = X;
        }
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

    public void InsertOrder(int Dato){
        Orderby();
        if(Punta==null){
            InsertEnd(Dato);
        } else if (Punta.getDato()>Dato) {
            InsertStart(Dato);
        }else{
            Nodo P=Punta;
            boolean Find=true;
            while (P.getLiga()!=null && Find){
                if(P.getLiga()==null && (P.getDato()<Dato)){
                    InsertEnd(Dato);
                    Find=false;
                }

                if((P!=Punta && P.getLiga()!=null) && (P.getDato()<=Dato && (P.getLiga()).getDato()<=Dato )){
                    Nodo X=new Nodo(Dato);
                    P.setLiga(X);
                    X.setLiga(P.getLiga());
                }
            }
        }
    }

    public void Orderby(){
        Nodo P,X;
        if(Punta!=null){
            P=Punta;
            while (P.getLiga()!=null){
                X=Punta;
                while ((X.getLiga()).getLiga()!=null) {
                    if (P.getDato()>(P.getLiga()).getDato()){
                        Swap(P,(P.getLiga()).getLiga());
                    }
                    X = X.getLiga();
                }
                P = P.getLiga();
            }
        }
    }

    public void Swap(Nodo P, Nodo X){
        int aux=P.getDato();
        P.setDato(X.getDato());
        X.setDato(aux);
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
