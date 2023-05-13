import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int irmaos;
        Double energia,internet,divisao;
        System.out.print("quantos irmãos moram na casa? ");
        irmaos=ent.nextInt();
        System.out.print("informe o valor da conta de energia: ");
        energia=ent.nextDouble();
        System.out.print("informe o valor da conta de internet: ");
        internet=ent.nextDouble();
        divisao=(energia+internet)/irmaos;
        if(irmaos<=0){
            System.out.println("precisa existir alguem para pagar a conta");
        }
        else if(irmaos==1){
            System.out.println("filho unico paga sozinho o valor de: R$"+divisao);
        }
        else{
            System.out.println("a divisao os valores feita para "+irmaos+" irmãos foi de: R$"+divisao+" para cada um");
        }
        ent.close();
    }
}
