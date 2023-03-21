import java.util.Scanner;

/**
 * @author Fazlı Berk Ördek - 21 Mart 2023 14.05 UTC+3
 */
/*
    Todo:
        - 2 köşe bilgisi al ! Double yad int; ✅
        -hipotenüsü hesapla = square(a) + square(b) = square(c) ✅
        -Alan:
            * Önce çevre hesabı olmalı  ;
                *Çevre(U) : 2 x u; U = (a+b+c) / 2 ✅
         -Sonra: Alan x Alan = u *(u-a) * (u-b) * (u-c) ✅
         NOT: Hepsini double alabiliriz ama kolay olsun diye int alacağım. ✅
     */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Değişkenleri tanımla
        int cornerOne, cornerTwo,A;
        double u,hptns;
        // Kenar bilgilerini al
        System.out.println("1.Kenarı girin");
        cornerOne = input.nextInt();

        System.out.println("2.Kenarı girin");
        cornerTwo = input.nextInt();

        //Hipotenüs hesabı:
         hptns = Math.sqrt((cornerOne*cornerOne) + (cornerTwo*cornerTwo));
        // hipotenüsün karesi= Math.sqrt(hptns);
        System.out.println("Hyptenus:"+ hptns);

        //Önce Çevre U hesaplanmalı:

        u = (cornerOne + cornerTwo + hptns)/2;
        // Çevre 2xu

        System.out.println("Çevresi:"+ 2*u);

        //Alan hesaplanacak:

        System.out.println("Alan : "+ Math.sqrt(u*(u-cornerOne)*(u-cornerTwo)*(u-hptns)));
                                            // 6*  (6-3) * (6-4) * (6-5)








    }
}