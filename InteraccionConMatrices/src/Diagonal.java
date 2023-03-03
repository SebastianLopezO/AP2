public class Diagonal {

    public static int[][] Primaria(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    matriz[i][j]=1;
                }
            }
        }
        return matriz;
    }

    public static int[][] Secundaria(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i+j==m-1){
                    matriz[i][j]=1;
                }
            }
        }
        return matriz;
    }
}
