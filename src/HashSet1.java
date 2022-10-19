import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("siva");
		hs.add("prasanth");
		hs.add("java");
		hs.add("siva");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("siva"));
		

	}

}
