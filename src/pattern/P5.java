package pattern;

public class P5 {
public static void main(String[] args) {
		
		int num=5, k=1;
		for(int i=0; i<num;i++) {
			for (int j=0; j<num; j++) {
				if(i+j<=num-3||i>=j+2||i+j>=num+1||i<=j-2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
			
	}

}
