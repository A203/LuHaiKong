package gggdhd;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,3,4,5,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int[] arr2=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
        	boolean flag=false;
        	for(int j=0;j<index;j++){
        		if(arr2[j]==arr[i]){
        			flag=true;
        			break;
        		}
        	}
        	if(!flag){
        		arr2[index]=arr[i];
        		index++;
        	}
        }
        int[] arr3=new int[index];
        for (int i=0;i<arr3.length;i++) {
        	arr3[i]=arr2[i];
        	System.out.print(arr3[i]+"\t");	
		}
   }
}
