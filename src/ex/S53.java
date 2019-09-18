package ex;

public class S53 {
	private static final double PI = 0;

	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		if (time == 0) {
			return Double.POSITIVE_INFINITY;
		} else {
			double speed = distance / time;
			return speed;
//        return 0;
		}
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	public static double distance(int x0, int y0, int x1, int y1) {
		if (x1 == x0 && y1 == y0) {
			return 0;
		} else {
			double pow1 = Math.pow(x1 - x0, 2);
			double pow2 = Math.pow(y1 - y0, 2);

			double distance = Math.sqrt(pow1 + pow2);
			return distance;
		}
	}

	/**
	 * Engine capacity
	 * 
	 * @param bore   in mm
	 * @param stroke in mm
	 * @param nr     number of cylinders
	 * @return the engine capacity in cm^3
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {
		double engineCapacity = (Math.PI * (Math.pow(bore / 2, 2)) * stroke * nr) * Math.pow(10, -3);
		return engineCapacity;
	}

	// somma delle cifre in un numero
	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		while (value != 0) {
			int a = value / 10;
			int b = value % 10;
			value = a;
			int digitSum = ++b;
			return digitSum;
		}
		return 0;
	}
}