import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Lista ListA = new Lista("ListA");
        Lista ListB = new Lista("ListB");
        Lista ListC = new Lista("ListC");
        Lista ListD = new Lista("ListD");
        Lista ListAns = new Lista("ListAns");

        //Puntero
        Lista L = null;
        Lista S = null;

        //Mapa de Variables
        Map<String, Lista> Variables = new HashMap<>();
        Variables.put("ListA", ListA);
        Variables.put("ListB", ListB);
        Variables.put("ListC", ListC);
        Variables.put("ListD", ListD);

        boolean app = true, action = true;
        String Option, OptionOpe[], OptionList, OptionShow;

        int num;

        do {
            action = true;
            OptionList = MenuList();

            switch (OptionList) {
                case "ListA":
                    L = ListA;
                    break;
                case "ListB":
                    L = ListB;
                    break;
                case "ListC":
                    L = ListC;
                    break;
                case "ListD":
                    L = ListD;
                    break;
                case "ListAns":
                    L = ListAns;
                    break;
                case "Operacion Con Listas":
                    OptionOpe = MenuOpe();
                    L = Variables.get(OptionOpe[0]);
                    S = Variables.get(OptionOpe[2]);

                    switch (OptionOpe[1]) {
                        case "+":
                            ListAns.Sum(L, S);
                            break;
                        case "-":
                            ListAns.Sub(L, S);
                            break;
                        case "*":
                            ListAns.Mult(L, S);
                            break;
                        case "/":
                            ListAns.Div(L, S);
                            break;
                        case "∪":
                            ListAns.JoinBraid(L, S);
                            break;
                    }
                    action = false;
                    break;
                case "Salir":
                    System.out.println("Hasta Luego, Vuelve pronto");
                    app = false;
                    action = false;
                    Export(new Lista[]{ListA, ListB, ListC, ListD, ListAns});
                    break;
            }
            while (action) {
                Option = Menu();
                switch (Option) {
                    case "Ingresar Ordenado":
                        L.InsertOrder(GetNum());
                        break;
                    case "Ingresar al Final":
                        L.InsertEnd(GetNum());
                        break;
                    case "Ingresar al Inicio":
                        L.InsertStart(GetNum());
                        break;
                    case "Ordenar Lista":
                        L.Sort();
                        break;
                    case "Ordenar Nodo":
                        L.Orderby();
                        break;
                    case "Comparar Lista":
                        OptionList = MenuList();
                        S=Variables.get(OptionList);
                        System.out.println("¿La lista "+L.Name+" es igual a la lista "+S.Name+"?:"+L.Compare(S));
                        break;
                    case "Mostrar Lista":
                        OptionShow = MenuShow();
                        switch (OptionShow) {
                            case "Consola":
                                L.ShowDetails();
                                break;
                            case "Panel":
                                L.Show();
                                break;
                            case "Web":
                                L.ShowListHtml();
                                break;
                        }
                        break;
                    case "Volver":
                        action = false;
                        break;
                }
            }
        } while (app);

    }

    public static String Menu() {
        String[] Options = {"Ingresar Ordenado", "Ingresar al Final", "Ingresar al Inicio", "Ordenar Lista","Ordenar Nodo","Comparar Lista","Mostrar Lista", "Volver"};
        String Option = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione la Opcion: ",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Options,
                Options[0]);

        return Option;
    }

    public static String MenuList() {
        String[] Options = {"ListA", "ListB", "ListC", "ListD", "ListaAns", "Operacion Con Listas", "Salir"};
        String Option = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione la Opcion: ",
                "Variables",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Options,
                Options[0]);

        return Option;
    }

    public static String[] MenuOpe() {
        JComboBox<String> Var1 = new JComboBox<>(new String[]{"ListA", "ListB", "ListC", "ListD"});
        JComboBox<String> Var2 = new JComboBox<>(new String[]{"ListA", "ListB", "ListC", "ListD"});
        JComboBox<String> Ope = new JComboBox<>(new String[]{"+", "-", "*", "/","∪"});

        Object[] msj = {Var1, Ope, Var2};
        JOptionPane.showConfirmDialog(null, msj, "Operacion a realizar:", JOptionPane.DEFAULT_OPTION);
        String[] Option = {(String) Var1.getSelectedItem(), (String) Ope.getSelectedItem(), (String) Var2.getSelectedItem()};
        return Option;
    }


    public static String MenuShow() {
        String[] Options = {"Consola",
                "Panel",
                "Web"
        };
        String Option = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una Opcion: ",
                "Mostrar",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Options,
                Options[0]);
        return Option;
    }

    public static int GetNum() {
        while (true) {
            try {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero a Insertar: "));
                return num;
            } catch (NumberFormatException ex) {
                System.out.println("No ha ingresado un numero");
            }
        }
    }

    public static String MenuShow(String List) {
        String[] Options = {"Consola",
                "Panel",
                "Web"
        };
        String Option = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una Opcion: ",
                "Mostrar " + List,
                JOptionPane.QUESTION_MESSAGE,
                null,
                Options,
                Options[0]);
        return Option;
    }

    public static void Export(Lista[] Elems) {
        //Archivo
        Html FileProyect = new Html();
        for (int i = 0; i < Elems.length; i++) {
            FileProyect.AddBody(Elems[i].ExportListHtml());
        }
        FileProyect.Export("Memory");
    }
}