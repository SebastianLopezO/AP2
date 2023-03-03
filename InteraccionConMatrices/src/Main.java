import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        boolean  app=true;
        Scanner read = new Scanner(System.in);

        System.out.print("Ingresa el numero de filas: ");
        int n = read.nextInt();
        System.out.print("Ingresa el numero de Columnas: ");
        int m = read.nextInt();


        System.out.print("Opciones: " +
                            "\n\t1. Diagonal Primaria" +
                            "\n\t2. Diagonal Secundaria" +
                            "\n\t3. Triangulo Primario Superior" +
                            "\n\t4. Triangulo Primario Inferior" +
                            "\n\t5. Triangulo Secundario Superior" +
                            "\n\t6. Triangulo Secundario Inferior" +
                            "\n\t7. Borde Exterior" +
                            "\n\t8. Borde Interior" +
                            "\n\t9. Caracol Horario" +
                            "\n\t10. Caracol AntiHorario   " +
                            "\n\t11. Suma de Matriz   " +
                            "\n\t12. Resta de Matriz   " +
                            "\n\t13. Multiplicacion de Matriz   " +
                            "\n\t14. Divison de Matriz   " +
                            "\n\t15. Matriz Ajedrez   " +
                            "\n\t16. Suma de Dos Matrices   " +
                            "\n\t17. Resta de Dos Marices   " +
                            "\n\t18. Multiplicacion de Dos Matrices   " +
                            "\n\t19. Divison de Dos Matrices   " +
                            "\n\t20. Finalizar   " +
                            "\nSeleccione una opcion: ");
        int mod = read.nextInt();

        int matriz[][]=Generar(n,m);
        int resultante[][]=Generar(2,Math.max(n,m));
        int matriz1[][]=Llenar(n,m);
        int matriz2[][]=Llenar(n,m);
        if(mod>=1 && mod<=10 || mod==15){
            System.out.println("Matriz Inicial:");
            Impresion.Default(matriz);
        }else if(mod>=11 && mod<=14){
            System.out.println("Matrices Iniciales:");
            Impresion.Itself(matriz1,resultante,"+");
        }else{
            System.out.println("Matrices Iniciales:");
            Impresion.Both(matriz1,matriz2,matriz,"+");
        }

        System.out.println("Matriz Resultante:");
        switch (mod){
            case 1:
                Impresion.Default(Diagonal.Primaria(matriz));
                break;
            case 2:
                Impresion.Default(Diagonal.Secundaria(matriz));
                break;
            case 3:
                Impresion.Default(Triangulo.PrimarioSuperior(matriz));
                break;
            case 4:
                Impresion.Default(Triangulo.PrimarioInferior(matriz));
                break;
            case 5:
                Impresion.Default(Triangulo.SecundarioSuperior(matriz));
                break;
            case 6:
                Impresion.Default(Triangulo.SecundarioInferior(matriz));
                break;
            case 7:
                Impresion.Default(Borde.Interior(matriz));
                break;
            case 8:
                Impresion.Default(Borde.Exterior(matriz));
                break;
            case 9:
                Impresion.Default(Caracol.Horario(matriz));
                break;
            case 10:
                Impresion.Default(Caracol.AntiHorario(matriz));
                break;
            case 11:
                Impresion.Itself(matriz1,Matriz.Sumar(matriz1),"+");
                break;
            case 12:
                Impresion.Itself(matriz1,Matriz.Restar(matriz1),"-");
                break;
            case 13:
                Impresion.Itself(matriz1,Matriz.Multiplicar(matriz1),"*");
                break;
            case 14:
                Impresion.Itself(matriz1,Matriz.Dividir(matriz1),"/");
                break;
            case 15:
                Impresion.Default(Matriz.Ajedrez(matriz));
                break;
            case 16:
                Impresion.Default(Caracol.AntiHorario(matriz));
                break;
            case 17:
                Impresion.Default(Caracol.AntiHorario(matriz));
                break;
            case 18:
                Impresion.Default(Caracol.AntiHorario(matriz));
                break;
            case 19:
                Impresion.Default(Caracol.AntiHorario(matriz));
                break;
            case 20:
                app=false;
                break;
            default:
                System.out.println("Esta Opcion es incorrecta");
        }
    }

    public static int[][] Generar(int n, int m) {
        int matriz[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=0;
            }
        }
        return matriz;
    }

    public static int[][] Llenar(int n, int m) {
        int matriz[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=new Random().nextInt((100 - 1) + 1) + 1;;
            }
        }
        return matriz;
    }
}