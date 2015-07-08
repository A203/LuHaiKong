package chose;

import java.util.Scanner;

public class demo1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        int day=scanner.nextInt();
        String dayString="";
        switch(day)
        {
        	case 1:dayString="monday";break;
        	case 2:dayString="tuesday";break;
        	case 3:dayString="wedensday";break;
        	case 4:dayString="thursday";break;
        	case 5:dayString="friday";break;
        	case 6:dayString="saturday";break;
        	case 7:dayString="sunday";break;
        }
        System.out.println(dayString);
	}

}
