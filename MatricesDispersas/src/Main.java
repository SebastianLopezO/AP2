public class Main {
    public static void main(String[] args) {
        //Matriz
        int[][] Matriz={
                {0,34,0},
                {33,0,33},
                {0,24,30},
                {0,0,0}
        };
        System.out.println("Matriz");
        PrintArray(Matriz);
        System.out.println("Tripleta");
        PrintArray(Tripleta(Matriz,DistinctZero(Matriz)));
    }

    public static void PrintArray(int[][] Matriz){
        int spaces=Digits(MaxArray(Matriz));
        for(int i=0;i<Matriz.length;i++){
            for(int j=0;j<Matriz[i].length;j++){
                int num=Matriz[i][j];
                System.out.print("| "+num+Spaces(spaces-Digits(num))+" |");
            }
            System.out.print("\n");
        }
    }

    public static int Digits(int num){
        return (String.valueOf(num)).length();
    }
    public static String Spaces(int num){
        String space="";
        for(int i=0;i<num;i++){
            space+=" ";
        }
        return space;
    }
    public static int MaxArray(int[][] Matriz){
        int max=0;
        for(int i=0;i<Matriz.length;i++){
            for(int j=0;j<Matriz[i].length;j++){
                if(Matriz[i][j]>max){
                    max=Matriz[i][j];
                }
            }
        }
        return max;
    }

    public static int DistinctZero(int [][] Matriz){
        int cont=0;
        for(int i=0;i<Matriz.length;i++){
            for(int j=0;j<Matriz[i].length;j++){
                if(Matriz[i][j]!=0){
                   cont++;
                }
            }
        }
        return cont;
    }

    public static int[][] Tripleta(int[][] Matriz, int diffzero){
        int[][] tripleta=new int[diffzero+2][3];
        tripleta[0][0]=Matriz.length; tripleta[0][1]=Matriz[0].length; tripleta[0][2]=diffzero;
        int cont=0;
        for(int i=0;i<Matriz.length;i++){
            for(int j=0;j<Matriz[i].length;j++){
                if(Matriz[i][j]!=0){
                    cont++;
                    tripleta[cont][0]=i;
                    tripleta[cont][1]=j;
                    tripleta[cont][2]=Matriz[i][j];
                }
            }
        }
        tripleta[diffzero+1][0]=Matriz.length+1; tripleta[diffzero+1][1]=Matriz[0].length+1;
        return tripleta;
    }
}