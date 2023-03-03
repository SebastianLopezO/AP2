public class Caracol {
    public static int[][] Horario(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;
        int STN = 0; int ENDN = n - 1;
        int STM = 0; int ENDM = m - 1;

        int num = 1;

        while (STN <= ENDN && STM <= ENDM) {
            for (int i = STM; i <= ENDM && STN <=ENDN; i++) {
                matriz[STN][i] = num++;
            }
            STN++;

            for (int j = STN; j <= ENDN && STM <= ENDM; j++) {
                matriz[j][ENDM] = num++;
            }
            ENDM--;

            for (int i = ENDM; i >= STM && STN <=ENDN; i--) {
                matriz[ENDN][i] = num++;
            }
            ENDN--;

            for (int j = ENDN; j >= STN && STM <=ENDM; j--) {
                matriz[j][STM] = num++;
            }
            STM++;
        }
        return matriz;
    }

    public static int[][] AntiHorario(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;
        int STN = 0; int ENDN = n - 1;
        int STM = m - 1; int ENDM =  0;

        int num = 1;

        while (STN <= ENDN && ENDM <= STM) {
            for (int i = STM; i >= ENDM && STN <= ENDN; i--) {
                matriz[STN][i] = num++;
            }
            STN++;

            for (int j = STN; j <= ENDN && STM >= ENDM; j++) {
                matriz[j][ENDM] = num++;
            }
            ENDM++;

            for (int i = ENDM; i <= STM && STN <= ENDN; i++) {
                matriz[ENDN][i] = num++;
            }
            ENDN--;

            for (int j = ENDN; j >= STN && STM >= ENDM; j--) {
                matriz[j][STM] = num++;
            }
            STM--;
        }
        return matriz;
    }
}
