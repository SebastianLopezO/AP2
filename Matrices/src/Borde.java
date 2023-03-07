public class Borde {
    public static int[][] Exterior(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i!=0 && i!=n-1) && (j!=0 && j!=m-1)){
                    matriz[i][j]=1;
                }
            }
        }
        return matriz;
    }

    public static int[][] Interior(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 || i==n-1) || (j==0 || j==m-1)){
                    matriz[i][j]=1;
                }
            }
        }
        return matriz;
    }
}
