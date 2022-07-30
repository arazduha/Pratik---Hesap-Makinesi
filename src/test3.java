import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        int a1, a2, isl;
        Scanner inp = new Scanner(System.in);

        System.out.print("1.sayiyi giriniz= ");
        a1 = inp.nextInt();

        System.out.print("2.sayiyi giriniz= ");
        a2 = inp.nextInt();

        System.out.print("-1 toplama-\n-2 cikarma-\n-3 carp-\n-4 bolme-");
        System.out.print("\nsecilen islem= ");
        isl = inp.nextInt();
        switch (isl) {
            case 1:
                System.out.println(a1 + a2);
                break;
            case 2:
                System.out.println(a1 - a2);
                break;
            case 3:
                System.out.println(a1 * a2);
                break;
            case 4:
                System.out.println(a1 / a2);
                break;
            default:
                System.out.println("gecerli bir islem deneyin!");
        }

    }
}

