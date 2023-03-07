import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Lista L1 = new Lista();
        Lista L2 = new Lista();
        L2.InsertEnd(8);
        L2.InsertEnd(3);
        L2.InsertEnd(5);
        L2.InsertEnd(11);
        boolean app = true;
        String Option,SubOption;
        int num;

        do {
            Option = Menu();
            switch (Option) {
                case "Ingresar Ordenado":
                    try {
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero a Insertar: "));
                    } catch (NumberFormatException ex) {
                        break;
                    }
                    L1.InsertOrder(num);
                    break;
                case "Ingresar al Final":
                    try {
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero a Insertar: "));
                    } catch (NumberFormatException ex) {
                        break;
                    }
                    L1.InsertEnd(num);
                    break;
                case "Ingresar al Inicio":
                    try {
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero a Insertar: "));
                    } catch (NumberFormatException ex) {
                        break;
                    }
                    L1.InsertStart(num);
                    break;
                case "Ordenar Lista":
                    L1.Orderby();
                    break;
                case "Mostrar Lista":
                    L1.Show();
                    break;
                case "Operacion Con Listas":
                    SubOption =MenuOpe();
                    switch (SubOption){
                        case "Suma de Listas":
                            L1=L1.OperList(L2, "+");
                            break;
                        case "Resta de Listas":
                            L1=L1.OperList(L2, "-");
                            break;
                        case "Multiplicacion de Listas":
                            L1=L1.OperList(L2, "*");
                            break;
                        case "Division de Listas":
                            L1=L1.OperList(L2, "/");
                            break;
                    }
                    break;
                case "Salir":
                    app = false;
                    break;
            }
        } while (app);

    }

    public static String Menu(){
        String[] Options = {"Ingresar Ordenado","Ingresar al Final", "Ingresar al Inicio","Ordenar Lista","Mostrar Lista","Operacion Con Listas", "Salir"};
        String Option =  (String) JOptionPane.showInputDialog(
                null,
                "Seleccione la Opcion: ",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Options,
                Options[0]);

        return Option;
    }

    public static String MenuOpe(){
        String[] Options = {"Suma de Listas","Resta de Listas","Multiplicacion de Listas","Division de Listas"};
        String Option =  (String) JOptionPane.showInputDialog(
                null,
                "Seleccione la Opcion: ",
                "Menu de Operaciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Options,
                Options[0]);

        return Option;
    }
}