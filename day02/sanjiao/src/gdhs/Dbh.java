package gdhs;

import java.util.Scanner;

public class Dbh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        int hang=input.nextInt();
        for (int i=1;i<=hang ;i++){
        	for (int j=1;j<=i;j++){
        	    System.out.print("*");
            }
        	System.out.println();
        } 
	}

}
