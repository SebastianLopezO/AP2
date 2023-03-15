import javax.swing.*;

public class Lista {
    //Atributos
    public Nodo Punta;

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


    public void InsertMid(int Dato){
        if(Punta==null){
            Nodo X=new Nodo(Dato);
            X.setLigaD(X); X.setLigaI(X);
            Punta=X;
        }else{
            if(Dato>Punta.getDato()){
                InsertRight(Dato);
            } else if (Dato<= Punta.getDato()) {
                InsertLeft(Dato);
            }
        }
    }

    public void InsertLeft(int Dato){
        Nodo X=new Nodo(Dato, Punta.getLigaI(),Punta);
        if(Punta.getLigaI()!=Punta){
            (Punta.getLigaI()).setLigaD(X);
        }
        Punta.setLigaI(X);
    }

    public void InsertRight(int Dato){
        Nodo X=new Nodo(Dato, Punta,Punta.getLigaD());
        if(Punta.getLigaD()!=Punta){
            (Punta.getLigaD()).setLigaI(X);
        }
        Punta.setLigaD(X);
    }

    public void ShowDetails() {
        String msj="",msjI="",msjD="";
        if(Punta!=null){
            //Izquierda
            Nodo PI=Punta.getLigaI();
            while (PI!=Punta){
                msjI="<= { "+PI.getLigaI()+"| "+PI.getDato()+" |"+PI.getLigaD()+" } =>"+msjI;
                PI=PI.getLigaI();
            }
            //Derecha
            Nodo PD=Punta.getLigaD();
            while (PD!=Punta){
                msjD+="<= { "+PD.getLigaI()+"| "+PD.getDato()+" |"+PD.getLigaD()+" } =>";
                PD=PD.getLigaD();
            }

            msj=msjI+"<= { "+Punta.getLigaI()+"| "+Punta.getDato()+" |"+Punta.getLigaD()+" } =>"+msjD;
        }
        JOptionPane.showMessageDialog(null, msj);
    }

    public void Show() {
        String msj="",msjI="",msjD="";
        if(Punta!=null){
            //Izquierda
            Nodo PI=Punta.getLigaI();
            while (PI!=Punta){
                msjI="<= { "+PI.getDato()+" } =>"+msjI;
                PI=PI.getLigaI();
            }
            //Derecha
            Nodo PD=Punta.getLigaD();
            while (PD!=Punta){
                msjD+="<= { "+PD.getDato()+" } =>";
                PD=PD.getLigaD();
            }

            msj=msjI+"<= {"+Punta.getDato()+"} =>"+msjD;
        }
        JOptionPane.showMessageDialog(null, msj);
    }
}
