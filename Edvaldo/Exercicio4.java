import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int dias, horas,multipicador,total;
        System.out.print("quantos dias durou sua viagem? ");
        dias=ent.nextInt();
        System.out.print("quantos horas durou sua viagem? ");
        horas=ent.nextInt();
        multipicador=dias*24;
        total=multipicador+horas;
        if(dias>0){
            System.out.println("sua viagem teve "+dias+" dias e "+horas+" horas \n seu total em horas foi de: "+multipicador+" horas");
        }
        else{
            System.out.println("sua viagem teve "+horas+ " horas");
        }
        ent.close();




    }
}
