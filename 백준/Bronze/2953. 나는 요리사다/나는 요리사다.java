import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2차원 배열 만들기
		int[][] a = new int[5][4];
		//참가자별 점수 합산 초기화
		int hap = 0;
		//참가자별 합산점수 배열만들기
		int[] haps = new int[5];
		// 최댓값 초기화 해주기
		int max = 0;
		// 
		//2차원 배열 입력 값 받기
		for(int i=0; i < 5; i++) {
			for(int j=0; j < 4; j++) {
				a[i][j] = sc.nextInt();
				//참가자별 점수 합산하기
				hap += a[i][j];			
			}
			//참가자별 합산 점수 배열에 넣어주기
			haps[i] = hap;
			// 합 초기화
			hap = 0;
		}
		sc.close();
		//최대값 비교
		for (int i=0; i <5; i++) {
			if(max < haps[i]) {
				max = haps[i];
			}
		}
		// 출력
		for (int i=0; i <5; i++) {
			if(max == haps[i]) {
				System.out.println((i+1));
				System.out.println(max);
			}
		}
	}
}