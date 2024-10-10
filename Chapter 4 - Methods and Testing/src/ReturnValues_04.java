
public class ReturnValues_04 {

	public static double calculateArea(double radius) {
		double resoult = Math.PI * radius * radius;
		return resoult;
	}

	public static void main(String[] args) {
		
		double diameter = 10.0;
		double area = calculateArea(diameter/2);
		
		System.out.print(area);
	}

}
