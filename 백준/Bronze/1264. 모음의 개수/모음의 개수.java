import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String text = sc.nextLine();
			if (text.equals("#")) {
				break;
			}
			int count = 0;
			for(int i=0; i < text.length(); i++) {
				char imsi = text.toLowerCase().charAt(i);
				if (imsi == 'a' || imsi == 'e' || imsi == 'i' ||  imsi == 'o' || imsi == 'u' ) {
					count ++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}
