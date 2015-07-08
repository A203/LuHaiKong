package adobe;

public class Adobe {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //打印1~99之间能够被5整除的数并记录不符合要求的数字的个数
		int j=0;
		for(int i=1;i<=99;i++){
			if(i%5==0)
			{
				System.out.println(i);
				continue;
			}
		    j=j+1;
		    }
		System.out.println("不符合要求数字的个数："+j);
	}

}
