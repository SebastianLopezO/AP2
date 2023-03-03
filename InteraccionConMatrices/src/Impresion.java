public class Impresion {
    public static void Default(int matriz[][]) {
        int n=matriz.length;
        int m=matriz[0].length;
        int lim=Integer.toString(n*m).length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num=matriz[i][j];
                int dnum=Integer.toString(num).length();
                String spaces=Spaces(lim-dnum);
                if(num==0){
                    System.out.print("| \033[31m" + matriz[i][j] +spaces+ "\033[0m |");
                }else{
                    System.out.print("| \033[32m" + matriz[i][j] +spaces+ "\033[0m |");
                }
            }
            System.out.print("\n");
        }
    }

    public static void Itself(int matriz[][], int Resultado[][],String ope) {
        int n=matriz.length;
        int m=matriz[0].length;

        int lim=3;
        for (int i = 0; i < n+1; i++) {
            if(i==n){
                for (int z = 0; z < m; z++) {
                    System.out.print("|  "+ope+"  |");
                }
                System.out.print("\n\n");
            }
            for (int j = 0; j < m+1; j++) {
                if(j<m && i<n){
                    int num=matriz[i][j];
                    int dnum=Integer.toString(num).length();
                    String spaces=Spaces(lim-dnum);
                    System.out.print("| \033[32m" + matriz[i][j] +spaces+ "\033[0m |");
                }else if(j==m && i<n){
                    int num=Resultado[0][i];
                    int dnum=Integer.toString(num).length();
                    String spaces=Spaces(lim-dnum);
                    System.out.print("\t"+ope+"\t| \033[32m" + Resultado[0][i] +spaces+ "\033[0m |");
                } else if (i==n && j<m) {
                    int num = Resultado[1][j];
                    int dnum = Integer.toString(num).length();
                    String spaces = Spaces(lim - dnum);
                    System.out.print("| \033[32m" + Resultado[1][j] + spaces + "\033[0m |");
                }
            }
            System.out.print("\n");
        }
    }

    public static void Both(int matriz1[][], int matriz2[][],int matriz[][], String ope) {
        int n=matriz1.length;
        int m=matriz1[0].length;

        int lim=3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num=matriz1[i][j];
                int dnum=Integer.toString(num).length();
                String spaces=Spaces(lim-dnum);
                System.out.print("| \033[32m" + matriz1[i][j] +spaces+ "\033[0m |");

            }
            System.out.print("\t"+ope+"\t");
            for (int j = 0; j < m; j++) {
                int num=matriz2[i][j];
                int dnum=Integer.toString(num).length();
                String spaces=Spaces(lim-dnum);
                System.out.print("| \033[32m" + matriz2[i][j] +spaces+ "\033[0m |");
            }
            System.out.print("\t=\t");
            for (int j = 0; j < m; j++) {
                int num=matriz[i][j];
                int dnum=Integer.toString(num).length();
                String spaces=Spaces(lim-dnum);
                System.out.print("| \033[32m" + matriz[i][j] +spaces+ "\033[0m |");
            }
            System.out.print("\n");
        }
    }

    public static String Spaces(int lim) {
        String space="";
        for(int i=0;i<lim;i++){
            space+=" ";
        }
        return space;
    }

    public static int Max(int[][] matriz) {
        int max = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }

    public static int Min(int[][] matriz) {
        int min = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
        }
        return min;
    }
}
