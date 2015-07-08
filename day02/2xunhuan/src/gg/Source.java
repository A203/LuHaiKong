package gg;


public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //打印出2~50之间所有质数
		 label:
	    for (int i=2;i<=50;i++)
	    {
	    	for (int j=2;j<i;j++) 
	    	{
	    	    if(i%j==0)
				continue label;
			}
		System.out.println(i);
	   }
	}

}
