public class Polinomio {
    public static int[] Transformar(String sPol){
        String monomios[]=sPol.split("(?=([+-]))");
        int vecCoe[]=new int[monomios.length];
        int vecExp[]=new int[monomios.length];

        //Impresion
        System.out.println(sPol);

        //Impresion
        for(int i=0;i<monomios.length;i++){
            System.out.print("["+monomios[i]+"]");
        }
        System.out.print("\n");

        //Impresion
        for(int i=0;i<monomios.length;i++){
            String partes[]=monomios[i].split("(?=([x]))");
            System.out.print("Monomio#"+(i+1)+" "+monomios[i]+": ");
            for(int j=0;j<partes.length;j++){
                System.out.print("["+partes[j]+"]");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for(int i=0;i<monomios.length;i++){
            String partes[]=monomios[i].split("(?=([x]))");
            if(partes.length==1){
                if(partes[0].contains("x")){
                    vecCoe[i]=1;
                    vecExp[i]=1;
                }else if(partes[0].matches("\\d+") || partes[0].matches("[+-]\\d+")){
                    vecCoe[i]=Integer.parseInt(partes[0]);
                    vecExp[i]=0;
                }
            }else if(partes.length==2){
                if(partes[0].matches("\\d+") || partes[0].matches("[+-]\\d+")){
                    vecCoe[i]=Integer.parseInt(partes[0]);
                }else if(partes[0].contains("+")){
                    vecCoe[i]=1;
                }else if(partes[0].contains("-")){
                    vecCoe[i]=-1;
                }

                if(partes[1].matches("x\\^\\d+")){
                    vecExp[i]=Integer.parseInt(partes[1].replace("x^",""));
                }else if(partes[1].contains("x")){
                    vecExp[i]=1;
                }
            }

        }

        System.out.print("Coeficientes: ");
        for(int i=0;i<monomios.length;i++){
            System.out.print("["+vecCoe[i]+"]");
        }
        System.out.print("\n");

        System.out.print("Exponentes: ");
        for(int i=0;i<monomios.length;i++){
            System.out.print("["+vecExp[i]+"]");
        }
        System.out.print("\n");
        return vecExp;
    }

    public static void Impresion(){

    }
}