package adobe;

public class Adobe {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //��ӡ1~99֮���ܹ���5������������¼������Ҫ������ֵĸ���
		int j=0;
		for(int i=1;i<=99;i++){
			if(i%5==0)
			{
				System.out.println(i);
				continue;
			}
		    j=j+1;
		    }
		System.out.println("������Ҫ�����ֵĸ�����"+j);
	}

}
