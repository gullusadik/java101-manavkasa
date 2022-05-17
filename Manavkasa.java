import java.util.Scanner;

public class Manavkasa {
    public static void main (String[] args) {

        double armutkilo,armuttl,armuttutar,elmatutar,elmatl,elmakilo,
                domatestutar,domatestl,domateskilo,muzkilo,muztl,muztutar,
                patlıcankilo,patlıcantl,patlıcantutar,toplamtutar;
        Scanner input = new Scanner(System.in);

        armuttl = 2.14;
        System.out.print("Armut kaç kilo? :");
        armutkilo = input.nextDouble();

        elmatl = 3.67;
        System.out.print("Elma kaç kilo? :");
        elmakilo = input.nextDouble();


        domatestl = 1.11;
        System.out.print("Domates kaç kilo? :");
        domateskilo = input.nextDouble();


        muztl = 0.95;
        System.out.print("Muz kaç kilo? :");
        muzkilo = input.nextDouble();


        patlıcantl = 5.00;
        System.out.print("Patlıcan kaç kilo? :");
        patlıcankilo = input.nextDouble();


        armuttutar = armuttl * armutkilo;
        elmatutar = elmatl * elmakilo;
        domatestutar = domatestl * domateskilo;
        muztutar = muztl * muzkilo;
        patlıcantutar = patlıcantl * patlıcankilo;

        toplamtutar = patlıcantutar + muztutar + elmatutar + armuttutar + domatestutar;

        System.out.println("Toplam tutar :"+ toplamtutar);


    }
}
