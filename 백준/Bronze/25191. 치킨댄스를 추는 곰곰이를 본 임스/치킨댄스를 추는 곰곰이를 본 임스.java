import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chicken = sc.nextInt();
		int coke = sc.nextInt();
		int beer = sc.nextInt();
		sc.close();
		if(chicken < (coke/2)+beer){
			System.out.println(chicken);
		}else
			System.out.println((coke/2)+beer);
	}
}
