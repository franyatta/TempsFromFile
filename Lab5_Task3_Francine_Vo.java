/*
 * Lab5_Task3_Francine_Vo.java
 * Francine Vo
 * 01253035
 * 09/27/2023
 */
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Lab5_Task3_Francine_Vo {

	public static void main(String[] args) {

		// 1. Declare and initialize variables
		double currentTemperature, minTemperature = Integer.MAX_VALUE, sum = 0;
		int minDay = 1;
		Scanner inData = null;

		// 2. Open input file
		try {
			inData = new Scanner(new File("input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.print("File not found");
			System.exit(1);
		}
		// 3. Display header
		System.out.printf("%-10s%-4s%s\n", "Month", "Day", "Temperature");
		System.out.print("=========================\n");

		// 4. Use a loop to read data from file
		for (int currentDay = 1; currentDay <= 31; currentDay++) {
			currentTemperature = inData.nextDouble();
			sum += currentTemperature;
			System.out.printf("%-10s%-4d%.2f°\n", "January", currentDay, currentTemperature);

			// 5. Find lowest temperature and lowest day
			if (currentTemperature < minTemperature) {
				minTemperature = currentTemperature;
				minDay = currentDay;
			}
		}
		// 6. Output results
		System.out.printf("The average temperature in January was: %.2f°\n", sum / 31);
		System.out.printf("The lowest temperature in January was: %.2f°\n", minTemperature);
		System.out.printf("the lowest temperature was on January %d", minDay);
	}
}