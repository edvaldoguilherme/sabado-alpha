import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Double desconto,novo;
        char tipo;
        System.out.print("digite o valor da sua compra: ");
        double valor=ent.nextDouble();

        ent.nextLine();
        System.out.print("FORMAS DE PAGAMENTO \nA VISTA digite V\nPARCELADO digite P\nDIGITE: ");
        tipo=ent.nextLine().charAt(0);

        if(tipo=='v'||tipo=='V'){
            desconto=valor*3/100;
            novo=valor-desconto;
            System.out.println("valor sem desconto: R$"+valor+"\nvalor do desconto: R$"+desconto+"\nnovo valor já com desconto: R$"+novo);
        }
        else if(tipo=='p'||tipo=='P'){
            desconto=valor*5/100;
            novo=valor-desconto;
            System.out.println("valor sem desconto: R$"+valor+"\nvalor do desconto: R$"+desconto+"\nnovo valor já com desconto: R$"+novo);
        }
        else{
            System.out.println("invalido");
        }
     
    }
}
