/*
 * Click nabfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interaccionconlistas;

import javax.swing.JOptionPane;
/**
 *
 * @author Sebastian Lopez Osorno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista L1 = new Lista();
        boolean app = true;
        String Option;
        int num;

        //Menu
        String[] Options = {"Ingresar Ordenado","Ingresar al Final", "Ingresar al Inicio","Ordenar Lista","Mostrar Lista", "Salir"};

        do {
            Option = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione la Opcion: ",
                    "Menu",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    Options,
                    Options[0]);

            switch (Option) {
                case "Ingresar Ordenado":
                    try {
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero a Insertar: "));
                    } catch (NumberFormatException ex) {
                        break;
                    }
                    L1.InsertOrder(num);
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
                case "Salir":
                    app = false;
                    break;
            }
        } while (app);

    }

}
