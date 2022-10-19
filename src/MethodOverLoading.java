
public class MethodOverLoading {
	
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading mol=new MethodOverLoading();
		System.out.println(mol.add(5, 10));
		System.out.println(mol.add(20, 30, 40));

	}

}
