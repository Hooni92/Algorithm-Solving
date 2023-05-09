import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int birthYear = sc.nextInt();
		int birthMonth = sc.nextInt();
		int birthDay = sc.nextInt();
		sc.nextLine();
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		//만나이
		int old1 = 0; 
		if((year > birthYear && month > birthMonth) || (year > birthDay && month == birthMonth && day >= birthDay) ) {
			old1 = year - birthYear;
			
		} else if ((year > birthYear && month < birthMonth) || (year > birthDay && month == birthMonth && day < birthDay)) {
			old1 = year - birthYear -1;
		} else { 
			old1 = 0;
		}
		//세는 나이
		int old2 = year - birthYear +1;
		//연나이
		int old3 = year - birthYear;
		System.out.println(old1);
		System.out.println(old2);
		System.out.println(old3);
	}
}