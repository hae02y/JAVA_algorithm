import java.util.*;

public class Baek_2440 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 1;
		
		while(num<=n) {
			
			for(int j=0;j<=n-num;j++) {
				
				System.out.print("*");
				
			}
			
			
			System.out.println();
			
			
			num++;
		}

	}

}
