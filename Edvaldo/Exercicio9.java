import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);  
        char tipopassagem;
        int quantpassagem, dias;
        Double valor,multiplicador;

        System.out.print("digite o tipo de passagem que voce vai utilizar: \n A= passagem tipo A \n B= passagem tipo B \n C= passagem tipo C\nDIGITE:");
        tipopassagem=ent.nextLine().charAt(0);
        System.out.print("quantos dias uteis você trabalha no mês? ");
        dias=ent.nextInt();
        System.out.print("quantas passagens você usa por dia? ");
        quantpassagem=ent.nextInt();
        if(tipopassagem=='A'||tipopassagem=='a'){
            valor=5.25;
            multiplicador=valor*quantpassagem*dias;
            System.out.println("o valor reembolsado será de: R$"+multiplicador);
        }
        else if(tipopassagem=='B'||tipopassagem=='B'){
            valor=6.5;
            multiplicador=valor*quantpassagem*dias;
            System.out.println("o valor reembolsado será de: R$"+multiplicador);

        }
        else if(tipopassagem=='c'||tipopassagem=='c'){
            valor=8.75;
            multiplicador=valor*quantpassagem*dias;
            System.out.println("o valor reembolsado será de: R$"+multiplicador);
        }
        else{
            System.out.println("valor digitado invalido");
        }
        }
    
}
