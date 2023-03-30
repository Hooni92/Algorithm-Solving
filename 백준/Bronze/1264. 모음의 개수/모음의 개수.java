import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String text =  sc.nextLine();
			if(text.equals("#")) {
				break;
			}else {
				int count = 0;
				for(int i = 0; i<text.length(); i++) {
					char alphabet = text.toLowerCase().charAt(i);
					if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
						count ++;
					}
				}
				System.out.println(count);
			}
		}
		sc.close();
	}
}
