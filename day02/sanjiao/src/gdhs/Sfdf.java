package gdhs;

import java.util.Scanner;

public class Sfdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for (int i=1;i<=num ;i++){
        	for(int j=1;j<=num-i;j++){
        		System.out.print(" ");
        	}
        	for (int j=1;j<=2*i-1;j++){
        		if(i<=9){
        			System.out.print(i);
        		}else{
        		    char ch=(char)(i+55);
        			System.out.print(ch);
        		    }
              }
        	System.out.println();
        } 
	}

}