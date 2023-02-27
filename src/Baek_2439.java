import java.util.*;

public class Baek_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 1;
		while(num<=n) {
		for(int i=1;i<=n-num;i++) {
			System.out.print(" ");
		}
		for(int j=1;j<=num;j++) {
			System.out.print("*");
		}	
		System.out.println();
		num++;
		}
	}

}
