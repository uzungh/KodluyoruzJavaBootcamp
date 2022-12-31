import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r,𝛼;
        double pi=3.14;

        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        System.out.println("Açı ölçüsü giriniz: ");

        r= inp.nextInt();
        𝛼= inp.nextInt();
        double alan=pi*r*r;
        double cevre=2*pi*r;
        double dilimAlan=(pi*(r*r)*𝛼)/360;


        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+cevre);
        System.out.println("Daire dilimi alanı: "+dilimAlan);



    }
}