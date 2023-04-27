public class Pila {
    //Atributos
    private int Lim;
    private int[] Vec;
    private int Tope;

    //Constructor
    public Pila(int n){
        this.Lim=n-1;
        this.Tope=-1;
        this.Vec = new int[n];
    }

    //Getter's and Setter's
    public int getLim() {
        return Lim;
    }

    public void setLim(int lim) {
        Lim = lim;
    }

    public int[] getVec() {
        return Vec;
    }

    public void setVec(int[] vec) {
        Vec = vec;
    }

    public int getTope() {
        return Tope;
    }

    public void setTope(int tope) {
        Tope = tope;
    }


    public boolean Empty(){
        return Tope==-1;
    }

    public boolean Full(){
        return Tope==Lim;
    }

    public void Stack(int num){
        Tope++;
        Vec[Tope]=num;
    }

    public int Unstack(int num){
        int aux=Vec[Tope];
        Tope--;
        Vec[Tope]=num;
        return aux;
    }
}
