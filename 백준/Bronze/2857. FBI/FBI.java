import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i=0; i<5; i++) {
			String imsi = sc.nextLine();
			if (imsi.contains("FBI")) {
				System.out.println(i+1);
				count++;
			}
		}
		sc.close();
		if(count== 0) {
			System.out.println("HE GOT AWAY!");
		}	
	}
}
