public class Tripleta {
    private int[][] tr;

    public Tripleta(int[][] Matriz) {
        int diffzero=DistinctZero(Matriz);
        this.tr = new int[diffzero + 2][3];
        //Encabezado
        tr[0][0] = Matriz.length;
        tr[0][1] = Matriz[0].length;
        tr[0][2] = diffzero;

        //Contenido
        int cont = 0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                if (Matriz[i][j] != 0) {
                    cont++;
                    tr[cont][0] = i;
                    tr[cont][1] = j;
                    tr[cont][2] = Matriz[i][j];
                }
            }
        }
        //Pie de Pagina
        tr[diffzero + 1][0] = Matriz.length + 1;
        tr[diffzero + 1][1] = Matriz[0].length + 1;
    }

    //Getts and setters

    public int[][] getTr() {
        return tr;
    }

    public static int DistinctZero(int[][] Matriz) {
        int cont = 0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                if (Matriz[i][j] != 0) {
                    cont++;
                }
            }
        }
        return cont;
    }


}
