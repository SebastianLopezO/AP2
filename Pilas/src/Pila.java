public class Pila {
    final int lim=6;
    int[] V = new int[lim];
    int Tope=-1;


    public boolean PilaEmpty(){
        if(Tope==-1){
            return true;
        }
        return false;
    }

    public boolean PilaFull(){
        if(Tope==lim){
            return true;
        }
        return false;
    }

    public void Stack(int num){
        Tope++;
        V[Tope]=num;
    }

    public int UnStack(int num){
        int aux=V[Tope];
        Tope--;
        V[Tope]=num;
        return aux;
    }
}
