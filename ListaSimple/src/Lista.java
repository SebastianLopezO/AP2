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

    //Utilidades

    public int Max(){
        int Dato;
        if(this.Punta!=null){
            Dato= Punta.getDato();
            for (Nodo P = this.Punta; P != null; P = P.getLiga()) {
                if(P.getDato()>Dato){
                    Dato=P.getDato();
                }
            }
        }else{
            Dato= 0;
        }
        return Dato;
    }
    public int Min(){
        int Dato;
        if(this.Punta!=null){
            Dato= Punta.getDato();
            for (Nodo P = this.Punta; P != null; P = P.getLiga()) {
                if(P.getDato()<Dato){
                    Dato=P.getDato();
                }
            }
        }else{
            Dato= 0;
        }
        return Dato;
    }
    public void Orderby(){
        Nodo P,X;
        if(this.Punta!=null){
            P=this.Punta;
            //Metodo Burbuja {Por cada N numeros se hace N recorridos}
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

    public void Truncate(){
        Punta=null;
        System.gc();
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

    //Operaciones

    public void OperList(Lista L, Lista S, String ope){
        Truncate();
        Nodo PL=L.getPunta();
        Nodo PS=S.getPunta();
        int DL,DS;

        while (PL!=null || PS!=null){
            //Obtener Digito de Lista L
            if(PL!=null){
                DL=PL.getDato();
                PL=PL.getLiga();
            }else{
                DL=0;
            }

            //Obtener Digito de Lista S
            if(PL!=null){
                DS=PS.getDato();
                PS=PS.getLiga();
            }else{
                DS=0;
            }

            switch (ope){
                case "+":
                    InsertEnd(DL+DS);
                    break;
                case "-":
                    InsertEnd(DL-DS);
                    break;
                case "*":
                    InsertEnd(DL*DS);
                    break;
                case "/":
                    try{
                        InsertEnd(DL/DS);
                    }catch (ArithmeticException  ex){
                        System.out.println("Division por cero");
                        InsertEnd(1);
                    }
                    break;
            }


        }
    }
}
