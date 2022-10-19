
public class Fan {

	private String make;
	private double radius;
	private String color;

public Fan(String make,double radius,String color)
{
	this.make=make;
	this.color=color;
	this.radius=radius;
	
}
public void StringtoString()
{
	String.format("make-%s","radius-%f","color-%s",make,radius,color);
}
}
