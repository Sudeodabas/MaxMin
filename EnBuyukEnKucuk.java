import java.util.Scanner;
public class EnBuyukEnKucuk {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int i,max = 0,min=100000;
        int number,sayac;
        System.out.print("Kaç sayı gireceksiniz: ");
        sayac=inp.nextInt();

        while (sayac!=0){
            System.out.println("Sayı giriniz: ");
            number=inp.nextInt();
            if(number>max){
                max=number;
            } else if (number<min) {
                min=number;
            }
            sayac--;
        }
        System.out.println("En büyük değer: " + max);
        System.out.println("En küçük değer: " + min);
    }
}
