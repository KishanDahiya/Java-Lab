package Shape;

public class Circle {
	float radius;
	float ans;
	
	public Circle(float radius)
	{
		this.radius =radius; 
	}
	public void circumference()
	{
		ans = (float) (2 * 3.14 * this.radius);
		System.out.println("The Perimeter of a Square is : "+ans);
	}
	
	public void area()
	{
		ans = (float) (3.14 * this.radius * this.radius);
		System.out.println("The Perimeter of a Square is : "+ans);
	}
}