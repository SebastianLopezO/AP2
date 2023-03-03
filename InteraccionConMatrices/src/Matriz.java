public class Matriz {
    public static int[][] Sumar(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;

        int resultado[][]=new int[2][Math.max(n,m)];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultado[0][i] += matriz[i][j];
                resultado[1][j] += matriz[i][j];
            }
        }
        return resultado;
    }

    public static int[][] Restar(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;
        int Resultado[][]=new int[2][Math.max(n,m)];
        //Inicializacion
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                Resultado[0][i]=matriz[i][0]*2;
                Resultado[1][j]=matriz[0][j]*2;
            }
        }
        //Operacion
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                    Resultado[0][i]-=matriz[i][j];
                    Resultado[1][j]-=matriz[i][j];
            }
        }
        return Resultado;
    }

    public static int[][] Multiplicar(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;

        int Resultado[][]=new int[2][Math.max(n,m)];
        //Inicializacion
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                Resultado[0][i]=1;
                Resultado[1][j]=1;
            }
        }
        //Operacion
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Resultado[0][i]*=matriz[i][j];
                Resultado[1][j]*=matriz[i][j];
            }
        }
        return Resultado;
    }

    public static int[][] Dividir(int[][] matriz){

        return matriz;
    }

    public static int[][] Ajedrez(int[][] matriz){
        int n=matriz.length;
        int m=matriz[0].length;
        boolean flag=true;

        for(int i=0;i<n;i++){
            if(m%2==0){
                if((i+1)%2!=0){
                    flag=true;
                }else{
                    flag=false;
                }
            }
            for(int j=0;j<m;j++){
                if(flag){
                    matriz[i][j]=1;
                    flag=false;
                }else{
                    matriz[i][j]=0;
                    flag=true;
                }
            }
        }
        return matriz;
    }
}
