import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
float armut=2.14f;
float elma=3.67f;
float domates=1.11f;
float muz=0.95f;
float patlican=5.00f;
int akilo,ekilo,dkilo,mkilo,pkilo;
Scanner inp=new Scanner(System.in);
System.out.println("Armut kaç kilo?:");
akilo=inp.nextInt();

System.out.println("Elma kaç kilo?:");
ekilo=inp.nextInt();

System.out.println("Domates kaç kilo?:");
dkilo=inp.nextInt();

System.out.println("Muz kaç kilo?:");
mkilo=inp.nextInt();

System.out.println("Patlıcan kaç kilo?:");
pkilo=inp.nextInt();
float toplam=(armut*akilo)+(elma*ekilo)+(domates*dkilo)+(muz*mkilo)+(patlican*pkilo);
System.out.println("Toplam Tutar:"+toplam);







    }
}