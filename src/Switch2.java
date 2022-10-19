
public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( determineNameOftheDay(3));

	}
	public static String determineNameOftheDay(int dayNumber)
	{
		String result="";
		switch(dayNumber)
		{
		case 0:
			result="sunday";
			break;
		case 1:
			result="monday";
			break;
		case 2:
			result="tuesday";
			break;
		case 3:
			result="wednesday";
			break;
		case 4:
			result="thursday";
			break;
		case 5:
			result="friday";
			break;
		case 6:
			result="saturday";
			break;
		
	}
		return result;
	

}
}