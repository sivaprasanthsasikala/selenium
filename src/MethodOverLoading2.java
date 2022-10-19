
public class MethodOverLoading2 {
	public int add(int a,int b)
	{
		return a+b;
	}
	public double add(double a,double b,double c)

	{
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MethodOverLoading2 mol=new  MethodOverLoading2();
		 System.out.println(mol.add(10, 20));
		System.out.println( mol.add(10, 20, 30));
		
		

	}

}
