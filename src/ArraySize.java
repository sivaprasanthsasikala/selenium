
public class ArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,24,25};
		//int[] arr1=new int[5];
		int[] newarr=new int[arr.length +1];
		newarr[0]=1;
		newarr[1]=2;
		newarr[2]=3;
		newarr[3]=4;
		for(int i=0;i<newarr.length;i++)
		{
			System.out.println(newarr[i]);
		}
		

	}

}
