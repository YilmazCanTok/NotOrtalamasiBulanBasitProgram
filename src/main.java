import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matematik,fizik,kimya,biyoloji,bedenegitimi,geometri,turkce,ingilizce;

        System.out.println("Öğrenci Adını Giriniz: ");
        String ad = scanner.nextLine();
        System.out.println("------------------------------------------------");
        System.out.println("Notlar: ");
        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik = scanner.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = scanner.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = scanner.nextInt();
        System.out.print("Biyoloji Notunuzu Giriniz: ");
        biyoloji = scanner.nextInt();
        System.out.print("Beden Eğitimi Notunuzu Giriniz: ");
        bedenegitimi = scanner.nextInt();
        System.out.print("Geometri Notunuzu Giriniz: ");
        geometri = scanner.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = scanner.nextInt();
        System.out.print("İngilizce Notunuzu Giriniz: ");
        ingilizce = scanner.nextInt();
        System.out.println("------------------------------------------------");
        double ortalama = (fizik+matematik+kimya+bedenegitimi+biyoloji+geometri+turkce+ingilizce)/8;
        System.out.println("Ortalamanız = "+ortalama);
    }
}
