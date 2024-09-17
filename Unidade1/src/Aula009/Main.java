package Aula009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Imovel imovel;
    String option;
        System.out.println("Digite tipo do imóvel (novo ou velho):");
        option = s.next();
        if (option.equalsIgnoreCase("novo")){
            String option2;
            option2 = s.next();
            imovel = new NovoImovel(200000, 10000);
            if (option2.equalsIgnoreCase("com")){
                imovel = new NovoImovelCorretor(200000, 10000, 0.05);
            }else {
                imovel = new NovoImovel(200000, 10000);
            }
        }else {
            imovel = new VelhoImovel(150000, 5000);
        }
    }
}
