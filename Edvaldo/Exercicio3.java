import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int gasolina,etanol,gnv,total;
        System.out.print("quanto voce abasteceu de gasolina: ");
        gasolina=ent.nextInt();
        System.out.print("quanto voce abasteceu de etanol: ");
        etanol=ent.nextInt();
        System.out.print("quanto voce abasteceu de gnv: ");
        gnv=ent.nextInt();
        total=gasolina+gnv+etanol;
        System.out.println("o valor total abastecido foi de: R$"+total);
        ent.close();

    }
}
