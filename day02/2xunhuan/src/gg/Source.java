package gg;


public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //��ӡ��2~50֮����������
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
