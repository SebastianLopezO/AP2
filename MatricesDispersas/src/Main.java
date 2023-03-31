public class Main {
    public static void main(String[] args) {
        //Matriz
        int[][] Matriz={
                {0,34,0},
                {33,0,33},
                {0,24,30},
                {0,0,0}
        };
        PrintArray(Matriz);
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

    public static int[][] Tripleta(int[][] Matriz){
        int[][] tripleta=new int[4][3];
        return tripleta;
    }
}