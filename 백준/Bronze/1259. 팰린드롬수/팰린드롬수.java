import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            int saveNum = num;          
            int result = 0;
            if(saveNum != 0){
                while(num != 0){
                    result = result*10 + num % 10;
                    num /= 10;
                }
                if( saveNum == result){
                    System.out.println("yes");
                }else{
                     System.out.println("no");
                }
            }else{
                sc.close();
                break;
            }
        }
    }
}