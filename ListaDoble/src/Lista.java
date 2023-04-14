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

    public void Symmetric(){
        int match=0;
        if(Length()%2==0){
            match=SymPair();
            System.out.print("En la lista par ");
        }else{
            match=SymOdd();
            System.out.print("En la lista impar ");
        }
        System.out.print("hay "+match+" elementos iguales\n");
    }

    public int SymOdd(){
        int cont=0; Nodo P=Punta, A=Cola;
        while (P!=A){
            if(P.getDato()==A.getDato()){
                cont++;
            }
            P=P.getLigaD(); A=A.getLigaI();
        }
        return cont;
    }

    public int SymPair(){
        int cont=0; Nodo P=Punta, A=Cola; boolean match=true;
        if(P!=null && A!=null){
            do{
                if(P.getDato()==A.getDato()){
                    cont++;
                }
                if(P.getLigaD()==A && A.getLigaI()==P){
                    match=false;
                }else{
                    P=P.getLigaD();
                    A=A.getLigaI();
                }
            }while (match);
        }
        return cont;
    }

    public void DelSerial(){
        Nodo P=Punta;
        while (P!=null){
            if(P.getLigaD()!=null){
                if(P.getDato()==(P.getLigaD()).getDato()){
                    DelNodo(P.getLigaD());
                }
            }
            P=P.getLigaD();
        }
    }

    public void DelNodo(Nodo A){
        (A.getLigaI()).setLigaD(A.getLigaD());
        if(A.getLigaD()!=null){
            (A.getLigaD()).setLigaI(A.getLigaI());
        }
    }

    public int Length(){
        int cont=0; Nodo P=Punta;
        while (P!=null){
            cont++;
            P=P.getLigaD();
        }
        return cont;
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
