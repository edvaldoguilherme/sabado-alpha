import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int peçam,peçat,total;

        System.out.print("representante do turno da manhã, digite quantas peças foram produzidas em seu turno:");
        peçam=ent.nextInt();
        System.out.print("representante do turno da tarde, digite quantas peças foram produzidas em seu turno:");
        peçat=ent.nextInt();
        total=peçam+peçat;
        System.out.println("o total de peças feitas no dia foi "+total);
        ent.close();
    }
}
