import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Double valor_atual,reajuste, novo;
        System.out.println("digite seu salario atual");
        valor_atual=ent.nextDouble();
        if(valor_atual<=2640 && valor_atual>0){
            reajuste=12.5*valor_atual/100;
            novo=valor_atual+reajuste;
            System.out.println("o valor do salario apos reajuste é de: "+novo);
        }
        else if(valor_atual>2640){
            reajuste=8.5*valor_atual/100;
            novo=valor_atual+reajuste;
            System.out.println("o valor do salario apos reajuste é de: "+novo);
        }
        else{
            System.out.println("valor invalido");
        }
        

  
    
}
}
