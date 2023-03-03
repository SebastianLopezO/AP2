public class Triangulo {
    public static int[][] PrimarioSuperior(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i<=j){
                    matriz[i][j]=1;
                }
            }
        }
        return matriz;
    }

    public static int[][] PrimarioInferior(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i>=j){
                    matriz[i][j]=1;
                }
            }
        }
        return matriz;
    }

    public static int[][] SecundarioSuperior(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i+j<=m-1){
                    matriz[i][j]=1;
                }
            }
        }
        return matriz;
    }
    public static int[][] SecundarioInferior (int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i+j>=m-1){
                    matriz[i][j]=1;
                }
            }
        }
        return matriz;
    }
}
