package gggdhd;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={21,13,91,23,72,78,88,66,47,67};
		int temp=0;
        for(int i=0;i<arr.length;i++){
        	for (int j=0;j<arr.length-i-1;j++){
				if (arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
        }
        for(int i=0;i<arr.length;i++)
        	System.out.print(arr[i]+"\t");
	}
}

