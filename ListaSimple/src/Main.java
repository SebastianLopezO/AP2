import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Lista L1 = new Lista();
        Lista L2 = new Lista();
        Lista L3 = new Lista();
        Lista L4 = new Lista();
        Lista LAns = new Lista();
        Lista L=new Lista();

        boolean app = true;
        String Option,SubOption,OptionList;
        int num;

        do {
            Option = Menu();
            OptionList = MenuList();

            switch (OptionList){
                case "ListA":
                    L = L1;
                    break;
                case "ListB":
                    L = L2;
                    break;
                case "ListC":
                    L = L3;
                    break;
                case "ListD":
                    L = L4;
                    break;
            }

            switch (Option) {
                case "Ingresar Ordenado":
                    try {
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero a Insertar: "));
                    } catch (NumberFormatException ex) {
                        break;
                    }
                    L.InsertOrder(num);
                    break;
                case "Ingresar al Final":
                    try {
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero a Insertar: "));
                    } catch (NumberFormatException ex) {
                        break;
                    }
                    L.InsertEnd(num);
                    break;
                case "Ingresar al Inicio":
                    try {
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero a Insertar: "));
                    } catch (NumberFormatException ex) {
                        break;
                    }
                    L.InsertStart(num);
                    break;
                case "Ordenar Lista":
                    L.Orderby();
                    break;
                case "Mostrar Lista":
                    L.Show();
                    break;
                case "Operacion Con Listas":
                    SubOption =MenuOpe();
                    switch (SubOption){
                        case "Suma de Listas":
                            LAns.OperList(L1,L2, "+");
                            break;
                        case "Resta de Listas":
                            LAns.OperList(L1,L2, "-");
                            break;
                        case "Multiplicacion de Listas":
                            LAns.OperList(L1,L2, "*");
                            break;
                        case "Division de Listas":
                            LAns.OperList(L1,L2, "/");
                            break;
                    }
                    break;
                case "Salir":
                    app = false;
                    break;
            }

            switch (OptionList){
                case "ListA":
                    L1= L;
                    break;
                case "ListB":
                    L2 = L;
                    break;
                case "ListC":
                    L3 = L;
                    break;
                case "ListD":
                    L4 = L;
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

    public static String MenuList(){
        String[] Options = {"ListA","ListB", "ListC","ListD","ListaAns"};
        String Option =  (String) JOptionPane.showInputDialog(
                null,
                "Seleccione la Opcion: ",
                "Variables",
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
                "Operaciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Options,
                Options[0]);

        return Option;
    }
}