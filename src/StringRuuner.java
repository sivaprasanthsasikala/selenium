
public class StringRuuner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] days= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		String dayswithsocharacters=" ";
		for(String day:days)
		{
			if(day.length()>dayswithsocharacters.length())
			{
				dayswithsocharacters=day;
			}
			System.out.println(dayswithsocharacters);
		}
		
		

	}

}
