import java.util.Scanner;
public class G5 {

	public static void main(String[] args) {
		Scanner DegerAl = new Scanner(System.in);
		System.out.println("Merhaba Hoşgeldiniz!!! \n"
				+ "Bu bir fibonacci dizisi uygulamasıdır\n"
				+ "Fibonacci dizisi kısacası kendinden önceki değer ile toplamına eşit olan sayılar dizisidir.\n");
		
		int Sayi_1 = 0;
		int Sayi_2 = 1;
		int Sıradaki_Sayi = 0;
		System.out.println("Lütfen fibonacci dizisi için bir basamak giriniz");
		int AlınacakDeger = DegerAl.nextInt();
		System.out.print(Sayi_1+", ");
		System.out.print(Sayi_2+", ");
		
		for(int i = 1;i <=AlınacakDeger-2;i++) {
			if (AlınacakDeger-2==1) {
				System.out.print(Sayi_1+", ");
				continue;
			}
			if(AlınacakDeger-2==2) {
				System.out.print(Sayi_2+", ");
				continue;
		}Sıradaki_Sayi = Sayi_1 + Sayi_2;
		Sayi_1 = Sayi_2;
		Sayi_2 = Sıradaki_Sayi;
		System.out.print(Sıradaki_Sayi+", ");
		DegerAl.close();
		}
	}

}

