import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int base,altura,total;
        System.out.print("digite a medida da base: ");
        base=ent.nextInt();
        System.out.print("digite a medida da altura: ");
        altura=ent.nextInt();
        total=base*altura;
        if(base<=0 || altura<=0){
            System.out.println("valores nagativos sao invalidos");
        }
        else if(base==altura){
        System.out.println("a area do quadrado é: "+total);
        }
        else{
            System.out.println("a area do retangulo é: "+total);

        }
        ent.close();

    }
    
}
