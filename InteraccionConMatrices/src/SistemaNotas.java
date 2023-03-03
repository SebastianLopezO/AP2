
 import javax.swing.JOptionPane;
/**
 *
 * @author Sebastian Lopez O
 */
public class SistemaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notas[][],estudiantes,materias,cantN;
        String est[];
        
        estudiantes=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la cantidad de estudiante: "));
        materias=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la cantidad de materias: "));
        cantN=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la cantidad de Notas de cada materia: "));
        
        est=new String[estudiantes];
        notas=new int[estudiantes][materias*cantN];
        
        for(int i=0;i<estudiantes;i++){
           est[i]="Estudiante#"+(i+1);
        }
        
        for(int i=0;i<estudiantes;i++){
            JOptionPane.showMessageDialog(null,est[i]);
           for(int j=0;j<materias;j++){
               for(int k=0;k<cantN;k++){
                   notas[i][j*cantN+k]=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la nota#"+(k+1)+" de la materia#"+(j+1)+": "));
               }
           }
        }
        
        Default(notas,est);
    }        
    
    public static void Default(int matriz[][],  String est[]) {
        int n=matriz.length;
        int m=matriz[0].length;
        int lim=3;
        for (int i = 0; i < n; i++) {
            System.out.print(est[i]+"\t");
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
    
}
