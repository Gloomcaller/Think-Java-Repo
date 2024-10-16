package chapter4sections;

public class MathMethods_03 {

	public static void main(String[] args) {

		double root = Math.sqrt(17.0);
		double angle = 1.5;
		double height = Math.sin(angle);

		double degrees = 90;
		double angleToRadiants = degrees / 180.0 * Math.PI;

		double radians = Math.toRadians(180.0);
		double degreesToDeg = Math.toDegrees(Math.PI);

		long xRounding = Math.round(Math.PI * 20.0);

		double xCos = Math.cos(angle + Math.PI / 2.0);

		double xExponential = Math.exp(Math.log(10.0));
		
		double xPower = Math.pow(2.0, 10.0);
	}

}
