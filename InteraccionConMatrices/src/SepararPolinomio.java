public class SepararPolinomio {
    public static void main(String[] args) {
        String polinomio = "-20x^10+15x^2-13x^2";
        String[] monomios = polinomio.split("(?=([+-]))",-1);

        System.out.println(polinomio);

        for(int i=0;i<monomios.length;i++){
            System.out.print("["+monomios[i]+"]");
        }
        System.out.print("\n");

        for(int i=0;i<monomios.length;i++){
            String[] partes = monomios[i].split("(?=([x]))",-1);
            System.out.print("Monomio#"+(i+1)+"["+monomios[i]+"] : ");
            for(int j=0;j<partes.length;j++){
                System.out.print("["+partes[j]+"]");
            }
            System.out.print("\n");
        }
    }
}
