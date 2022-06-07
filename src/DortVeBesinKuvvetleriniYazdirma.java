import java.util.Scanner;

public class DortVeBesinKuvvetleriniYazdirma {
    public static void main(String[] args) {
        int n;
        int i = 4;
        int k = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        n = input.nextInt();
        while (i <= n){
            i*=4;
            System.out.println("Dördün Kuvvetleri Olan Sayılar: " + i);
        }
        while (k <= n){
            k*=5;
            System.out.println("Beşin Kuvvetleri Olan Sayılar: " + k);
        }


    }
}
