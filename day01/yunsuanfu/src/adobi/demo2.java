package adobi;

public class demo2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean flag=false;
	        int m=0;
	        if(flag&&(++m)>0)
	        {
	        	
	        }
	        System.out.println("m��ֵ:"+m);
	        int a=3;
	        int b=2;
	       // System.out.println("a&b:"+(a&b));
	       // System.out.println("a|b:"+(a|b));
	       // System.out.println("a^b:"+(a^b));
	       // System.out.println("a>>b:"+(a>>b));
	       // System.out.println("a<<b:"+(a<<b));
	       // System.out.println("a>>>b:"+(a>>>b));
	        a+=b;
	        System.out.println(a+" "+b);
	        //��Ŀ�����
	        int score=80;
	        String type=score<60?"������":"����";
	        System.out.println(type);
	        
	        //+
	        System.out.println("1"+1+1);
	        System.out.println(1+1+"1");
	        
	        //��������ȼ�
	        int i=5;
	        int j=3;
	        boolean flag1=i+j<=8&&i-j>=2;
	        System.out.println(flag1);
	        
	        
	}

}
