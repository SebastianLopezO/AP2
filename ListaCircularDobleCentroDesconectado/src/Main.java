public class Main {
    public static void main(String[] args) {

        Lista L=new Lista();
        //Centro
        L.InsertMid(0);
        L.Show();
        //Izquierda
        L.InsertMid(-4);
        L.Show();
        L.InsertMid(-3);
        L.Show();
        L.InsertMid(-2);
        L.Show();
        L.InsertMid(-1);
        L.Show();
        //Derecha
        L.InsertMid(4);
        L.Show();
        L.InsertMid(3);
        L.Show();
        L.InsertMid(2);
        L.Show();
        L.InsertMid(1);
        L.Show();
        L.ShowDetails();
    }
}