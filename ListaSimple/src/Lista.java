import javax.swing.*;

public class Lista {

    //Atributos
    public Nodo Punta;

    //Constructor
    public Lista() {
        this.Punta = null;
    }

    //Get's and Set's
    public Nodo getPunta() {
        return this.Punta;
    }

    public void setPunta(Nodo Punta) {
        this.Punta = Punta;
    }

    //Metodos
    public void InsertStart(int Dato) {
        Nodo P, X = new Nodo(Dato);
        if (this.Punta == null) {
            this.Punta = X;
        }else{
            X.setLiga(this.Punta);
            this.Punta = X;
        }
    }

    public void InsertEnd(int Dato) {
        Nodo P, X = new Nodo(Dato);

        if (this.Punta == null) {
            this.Punta = X;
        }else{
            P = this.Punta;
            while (P.getLiga() != null) {
                P = P.getLiga(); //Avance de Liga
            }
            P.setLiga(X);
        }

    }

    public void InsertOrder(int Dato){
        Orderby();
        if(this.Punta==null){
            InsertEnd(Dato);
        } else if (this.Punta.getDato()>Dato) {
            InsertStart(Dato);
        }else{
            Nodo P=this.Punta;
            Boolean Find=true;
            while (P!=null && Find){
                if (P.getDato()<=Dato && P.getLiga()==null ) {
                    InsertEnd(Dato);
                    Find=false;
                } else if (P.getDato()<=Dato && (P.getLiga()).getDato()>=Dato) {
                    Nodo X=new Nodo(Dato);
                    X.setLiga(P.getLiga());
                    P.setLiga(X);
                    Find=false;
                }
                P=P.getLiga();
            }
        }
    }

    public void Orderby(){
        Nodo P,X;
        if(this.Punta!=null){
            P=this.Punta;
            while (P.getLiga()!=null){
                X=this.Punta;
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

    public int Length(){
        int cont=0;
        Nodo P;
        for (P = this.Punta; P != null; P = P.getLiga()) {
            cont++;
        }
        return cont;
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


    public Lista OperList(Lista L,String ope) {
        Lista LR=new Lista();
        Nodo P1=Punta,P2=L.getPunta(),P = null;
        int Dg1=0,Dg2=0;
        while(P1!=null || P2!=null){
            if(P1!=null){
                Dg1=P1.getDato();
                P1=P1.getLiga();
            }else{
                Dg1=0;
            }
            if(P2!=null){
                Dg2=P2.getDato();
                P2=P2.getLiga();
            }else{
                Dg2=0;
            }
            switch (ope){
                case "+":
                    LR.InsertEnd(Dg1+Dg2);
                    break;
                case "-":
                    LR.InsertEnd(Dg1-Dg2);
                    break;
                case "*":
                    LR.InsertEnd(Dg1*Dg2);
                    break;
                case "/":
                    int num;
                    try{
                        num=Dg1/Dg2;
                    }catch (ArithmeticException  ex){
                        System.out.println("Division por cero");
                        num=1;
                    }
                    LR.InsertEnd(num);
                    break;
            }
        }
        return LR;
    }
}
