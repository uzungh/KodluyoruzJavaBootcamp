import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler
        int a,b;
        double c;
        double cevre, alan;

        Scanner girdi=new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
        a=girdi.nextInt();
        System.out.print("2. kenarı giriniz: ");
        b=girdi.nextInt();

        c=Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: "+c);
        cevre=a+b+c;
        System.out.println("Çevre: "+cevre);
        alan=((a*b)/2);
        System.out.println("Alan: "+alan);




    }
}