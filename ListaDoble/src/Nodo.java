public class Nodo {
    //Atributos
    private int Dato;
    public Nodo LigaI;
    public Nodo LigaD;

    public Nodo(int Dato) {
        this.Dato = Dato;
        this.LigaI = null;
        this.LigaD = null;
    }

    public int getDato() {
        return Dato;
    }

    //Get's and Set's
    public void setDato(int dato) {
        Dato = dato;
    }

    public Nodo getLigaI() {
        return LigaI;
    }

    public void setLigaI(Nodo ligaI) {
        LigaI = ligaI;
    }

    public Nodo getLigaD() {
        return LigaD;
    }

    public void setLigaD(Nodo ligaD) {
        LigaD = ligaD;
    }




}
