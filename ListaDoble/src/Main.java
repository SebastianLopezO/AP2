public class Main {
    public static void main(String[] args) {

        Lista L=new Lista();
        L.InsertEnd(1);
        L.InsertEnd(2);
        L.InsertEnd(3);
        L.InsertEnd(3);
        L.InsertEnd(2);
        L.InsertEnd(1);
        L.Show();
        L.Symmetric();
        L.DelSerial();
        L.Show();
    }
}