/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interaccionconlistas;

/**
 *
 * @author Sebastian Lopez Osorno
 */
public class Nodo {
    //Atributos
    public int Dato;
    public Nodo Liga;
    
    public Nodo(int Dato){
        this.Dato = Dato;
        this.Liga = null;
    }
    
    //Constructor
    public Nodo(int Dato,Nodo Liga){
        this.Dato = Dato;
        this.Liga = Liga;
    }
   
    
    public Nodo(){
        this.Dato = 0;
        this.Liga = null;
    }
    
    //Get's and Set's
    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public Nodo getLiga() {
        return Liga;
    }

    public void setLiga(Nodo Liga) {
        this.Liga = Liga;
    }
}
