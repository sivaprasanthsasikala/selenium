import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("siva");
		al.add("prasanth");
		System.out.println(al);
		al.add(1,"java");
		System.out.println(al);
		System.out.println(al.contains("testing"));
		System.out.println(al.indexOf("java"));
		System.out.println(al.size());

	}

}
