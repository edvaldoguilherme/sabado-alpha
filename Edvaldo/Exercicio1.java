import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int disc, mensal;
        System.out.print("quantas disciplinas você cursa? ");
        disc=ent.nextInt();
        mensal=disc*100;
        System.out.println("o valor total da sua mensalidade é: R$"+mensal);
        ent.close();
    }
    
}
