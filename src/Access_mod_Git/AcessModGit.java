package Access_mod_Git;

import java.util.Scanner;

public class AcessModGit {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENter the no 1-100 :");
	String userNo = sc.nextLine();
	
	int no =Integer.parseInt(userNo);
	System.out.println(no);
	int sum = no +100;
	System.out.println(sum);
	int stringNo =100;
	String Sno = String.valueOf(stringNo);

	System.out.println(Sno+100);
	}

}
