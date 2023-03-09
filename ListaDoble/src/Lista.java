import javax.swing.*;

public class Lista {
    //Atributos
    public Nodo Punta;
    public Nodo Cola;

    public Lista() {
        this.Punta = null;
    }

    //Get´s and Set´s
    public Nodo getPunta() {
        return Punta;
    }

    public void setPunta(Nodo punta) {
        Punta = punta;
    }

    public Nodo getCola() {
        return Cola;
    }

    public void setCola(Nodo cola) {
        Cola = cola;
    }

    public void InsertEnd(int Dato) {
        Nodo P1, P2, X = new Nodo(Dato);

        if (this.Punta == null) {
            this.Punta = X;
            this.Cola = X;
        } else {
            P1 = this.Punta;
            P2 = this.Punta;
            while (P2.getLigaD() != null) {
                P1 = P2;
                P2 = P2.getLigaD(); //Avance de Liga
            }
            P2.setLigaD(X);
            if(P2!=this.Punta){
                P2.setLigaI(P1);
            }
            this.Cola = P2.getLigaD();
            this.Cola.setLigaI(P2);
        }

    }

    public void Show() {
        String msj = "[ ";
        Nodo P;
        for (P = this.Punta; P != null; P = P.getLigaD()) {
            msj += "|"+P.getLigaI()+" | " + P.getDato() + " | " + P.getLigaD() + " |  => ";
        }
        msj += " ] \n Punta: "+Punta+"\nCola: "+Cola;

        JOptionPane.showMessageDialog(null, msj);
    }
}
