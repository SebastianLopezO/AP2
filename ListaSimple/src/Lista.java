import javax.swing.*;

public class Lista {

    //Atributos
    public Nodo Punta;
    public String Name, Method = "empty";

    //Constructor
    public Lista(String Name) {
        this.Punta = null;
        this.Name = Name;
    }

    //Get's and Set's
    public Nodo getPunta() {
        return this.Punta;
    }

    public void setPunta(Nodo Punta) {
        this.Punta = Punta;
    }

    //Metodos
    public void InsertStart(int Dato) {
        Nodo P, X = new Nodo(Dato);
        if (this.Punta == null) {
            this.Punta = X;
        } else {
            X.setLiga(this.Punta);
            this.Punta = X;
        }
    }

    public void InsertEnd(int Dato) {
        Nodo P, X = new Nodo(Dato);

        if (this.Punta == null) {
            this.Punta = X;
        } else {
            P = this.Punta;
            while (P.getLiga() != null) {
                P = P.getLiga(); //Avance de Liga
            }
            P.setLiga(X);
        }

    }

    public void InsertOrder(int Dato) {
        Orderby();
        if (this.Punta == null) {
            InsertEnd(Dato);
        } else if (this.Punta.getDato() > Dato) {
            InsertStart(Dato);
        } else {
            Nodo P = this.Punta;
            Boolean Find = true;
            while (P != null && Find) {
                if (P.getDato() <= Dato && P.getLiga() == null) {
                    InsertEnd(Dato);
                    Find = false;
                } else if (P.getDato() <= Dato && (P.getLiga()).getDato() >= Dato) {
                    Nodo X = new Nodo(Dato);
                    X.setLiga(P.getLiga());
                    P.setLiga(X);
                    Find = false;
                }
                P = P.getLiga();
            }
        }
    }

    //Utilidades

    public int Max() {
        int Dato;
        if (this.Punta != null) {
            Dato = Punta.getDato();
            for (Nodo P = this.Punta; P != null; P = P.getLiga()) {
                if (P.getDato() > Dato) {
                    Dato = P.getDato();
                }
            }
        } else {
            Dato = 0;
        }
        return Dato;
    }

    public int Min() {
        int Dato;
        if (this.Punta != null) {
            Dato = Punta.getDato();
            for (Nodo P = this.Punta; P != null; P = P.getLiga()) {
                if (P.getDato() < Dato) {
                    Dato = P.getDato();
                }
            }
        } else {
            Dato = 0;
        }
        return Dato;
    }

    public void Orderby() {
        Nodo P, X;
        if (this.Punta != null) {
            P = this.Punta;
            //Metodo Burbuja {Por cada N numeros se hace N recorridos}
            while (P.getLiga() != null) {
                X = this.Punta;
                while ((X.getLiga()).getLiga() != null) {
                    if (P.getDato() > (P.getLiga()).getDato()) {
                        Swap(P, (P.getLiga()).getLiga());
                    }
                    X = X.getLiga();
                }
                P = P.getLiga();
            }
        }
    }

    public void Sort() {
        Nodo P, X;
        if (this.Punta != null) {
            P = this.Punta;
            //Metodo Burbuja {Por cada N numeros se hace N recorridos}
            while (P.getLiga() != null) {
                X = this.Punta;
                while ((X.getLiga()).getLiga() != null) {
                    if (P.getDato() > (P.getLiga()).getDato()) {
                        Swap(P, (P.getLiga()).getLiga());
                    }
                    X = X.getLiga();
                }
                P = P.getLiga();
            }
        }
    }


    public void Swap(Nodo P, Nodo X) {
        int aux = P.getDato();
        P.setDato(X.getDato());
        X.setDato(aux);
    }

    public int Length() {
        int cont = 0;
        Nodo P;
        for (P = this.Punta; P != null; P = P.getLiga()) {
            cont++;
        }
        return cont;
    }

    public void Truncate() {
        Punta = null;
        System.gc();
    }

    public void Show() {
        String msj = Name+": [ ";
        Nodo P;
        for (P = this.Punta; P != null; P = P.getLiga()) {
            msj += "| " + P.getDato() + " | " + P.getLiga() + " |  => ";
        }
        msj += " ]";
        JOptionPane.showMessageDialog(null, msj);
    }

    public void ShowDetails() {
        String msj = Name+": [ ";
        Nodo P;
        for (P = this.Punta; P != null; P = P.getLiga()) {
            msj += "| " + P.getDato() + " | " + P.getLiga() + " |  => ";
        }
        msj += " ]";
        System.out.println(msj);
    }

    //Operaciones

    public void Sum(Lista L, Lista S) {
        Truncate();
        Nodo PL = L.getPunta();
        Nodo PS = S.getPunta();
        int DL, DS;
        while (PL != null || PS != null) {
            //Obtener Digito de Lista L
            if (PL != null) {
                DL = PL.getDato();
                PL = PL.getLiga();
            } else {
                DL = 0;
            }

            //Obtener Digito de Lista S
            if (PL != null) {
                DS = PS.getDato();
                PS = PS.getLiga();
            } else {
                DS = 0;
            }
            InsertEnd(DL + DS);
        }
    }

    public void Sub(Lista L, Lista S) {
        Truncate();
        Nodo PL = L.getPunta();
        Nodo PS = S.getPunta();
        int DL, DS;
        while (PL != null || PS != null) {
            //Obtener Digito de Lista L
            if (PL != null) {
                DL = PL.getDato();
                PL = PL.getLiga();
            } else {
                DL = 0;
            }

            //Obtener Digito de Lista S
            if (PL != null) {
                DS = PS.getDato();
                PS = PS.getLiga();
            } else {
                DS = 0;
            }
            InsertEnd(DL - DS);
        }
    }

    public void Mult(Lista L, Lista S) {
        Truncate();
        Nodo PL = L.getPunta();
        Nodo PS = S.getPunta();
        int DL, DS;
        while (PL != null || PS != null) {
            //Obtener Digito de Lista L
            if (PL != null) {
                DL = PL.getDato();
                PL = PL.getLiga();
            } else {
                DL = 0;
            }

            //Obtener Digito de Lista S
            if (PL != null) {
                DS = PS.getDato();
                PS = PS.getLiga();
            } else {
                DS = 0;
            }
            InsertEnd(DL * DS);
        }
    }

    public void Div(Lista L, Lista S) {
        Truncate();
        Nodo PL = L.getPunta();
        Nodo PS = S.getPunta();
        int DL, DS;
        while (PL != null || PS != null) {
            //Obtener Digito de Lista L
            if (PL != null) {
                DL = PL.getDato();
                PL = PL.getLiga();
            } else {
                DL = 0;
            }

            //Obtener Digito de Lista S
            if (PL != null) {
                DS = PS.getDato();
                PS = PS.getLiga();
            } else {
                DS = 0;
            }
            try {
                InsertEnd(DL / DS);
            } catch (ArithmeticException ex) {
                System.out.println("Division por cero");
            }
        }
    }

    public String ExportListHtml() {
        Nodo P = this.Punta;
        String html = "<div class=\"container\">" +
                "<div class=\"container-title\">" +
                "<div class=\"title\">" + Name + "</div>" +
                "<div class=\"text\">" + Method + "</div>" +
                "</div>";

        while (P != null) {
            html += "<table>" +
                    "<tr>" +
                    "<td class=\"transparent\">" + P + "</td>" +
                    "</tr>" +
                    "<tr>" +
                    "<td class=\"yellow\">" + P.getDato() + "</td>" +
                    "<td class=\"green\">" + P.getLiga() + "</td>" +
                    "</tr>" +
                    "</table>" +
                    "<div class=\"flecha\">&#8646;</div>";
            P = P.getLiga();
        }

        html += "</div>";
        return html;
    }

    public void ShowListHtml() {
        Nodo P = this.Punta;
        String html = "<div class=\"container\">" +
                "<div class=\"container-title\">" +
                "<div class=\"title\">" + Name + "</div>" +
                "<div class=\"text\">" + Method + "</div>" +
                "</div>";

        while (P != null) {
            html += "<table>" +
                    "<tr>" +
                    "<td class=\"transparent\">" + P + "</td>" +
                    "</tr>" +
                    "<tr>" +
                    "<td class=\"yellow\">" + P.getDato() + "</td>" +
                    "<td class=\"green\">" + P.getLiga() + "</td>" +
                    "</tr>" +
                    "</table>" +
                    "<div class=\"flecha\">&#8646;</div>";
            P = P.getLiga();
        }

        html += "</div>";
        Html File = new Html();
        File.AddBody(html);
        File.Export(Name);
    }

}

