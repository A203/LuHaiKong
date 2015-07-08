package adobi;

public class demo2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean flag=false;
	        int m=0;
	        if(flag&&(++m)>0)
	        {
	        	
	        }
	        System.out.println("m的值:"+m);
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
	        //三目运算符
	        int score=80;
	        String type=score<60?"不及格":"及格";
	        System.out.println(type);
	        
	        //+
	        System.out.println("1"+1+1);
	        System.out.println(1+1+"1");
	        
	        //运算符优先级
	        int i=5;
	        int j=3;
	        boolean flag1=i+j<=8&&i-j>=2;
	        System.out.println(flag1);
	        
	        
	}

}
