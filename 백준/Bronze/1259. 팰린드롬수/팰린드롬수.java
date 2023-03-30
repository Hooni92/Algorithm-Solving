import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Scanner sc=new Scanner(System.in);
		while (true) {
			int text = sc.nextInt();
			
			int a = Integer.parseInt(sb.append(text).reverse().toString());
			sb.delete(0, sb.length());
			if (text == a) {
				if (text == 0) {
					break;
				}
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		sc.close();
	}
}