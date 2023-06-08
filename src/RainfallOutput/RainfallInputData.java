package RainfallOutput;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class RainfallInputData {

	public static void main(String[] args) {

		// 1. Declare output file 
		String sourceFile = "rainfallOutput.txt";
		System.out.println("Reading data from " + sourceFile + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			// Variables for processing byte-based data
			int rainfall = 0;
			int totalRainfall = 0;
			int noOfRecords = 0;
			String station = "";
			
			// 3. Process data until end-of-file
			station = dis.readUTF();
			while(dis.available() > 0) {
				
				// Read data
				//station = dis.readUTF();
				rainfall = dis.readInt();
				System.out.println( station + "\t" + rainfall);
				
				// Calculate total utilization
				totalRainfall += rainfall;
				noOfRecords ++;
			}
			
			// 4. Close stream
			dis.close();
			
			// Calculate average utlization
			int averageRainfall = totalRainfall / noOfRecords;
			//String formattedAverage = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage Rainfall for " + noOfRecords 
					+ " days: " + averageRainfall);
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");
		

	}
}
