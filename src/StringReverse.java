import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] chr=str.toCharArray();
		for(int i=chr.length-1;i>=0;i--) {
			System.out.print(chr[i]);
		}

	}



}
