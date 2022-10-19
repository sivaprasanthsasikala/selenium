import java.util.ArrayList;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,3,6,5,10,20};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}

		
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("siva");
		a.add("prasanth");
		a.add("selenium");
		System.out.println(a.get(2));
	}

}
