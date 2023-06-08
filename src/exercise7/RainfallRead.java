package exercise7;

import java.io.BufferedReader;
import java.io.FileReader;

public class RainfallRead {

	public static void main (String [] args)
	{
		String referFile = "RainfallWriter.txt";
		System.out.println ("Reading data from " + referFile + "\n");
		
		try {
			
			BufferedReader dis = new BufferedReader(new FileReader(referFile));
			
			// Variables for processing byte-based data
			int totaldailyRF = 0;
			int count=0;
			
			
			String Data;
			String SaveData[] = {};
			
			
			while ((Data = dis.readLine()) != null) {
				
			   SaveData =Data.split(",");
			   
			}
			
			String station = SaveData[0];
			System.out.println(station);
			System.out.print("Data Rainfall : ");
			for (int i=1 ; i< SaveData.length; i++)
			{
			   System.out.print(SaveData[i]+", ");
			   totaldailyRF += Integer.parseInt(SaveData[i]);
			   count++;
			}
			
			dis.close();
			
			int averageRF = totaldailyRF / count;
			System.out.print("\nAverage daily rainfall for " + count
					+ " day in " + station + ": " + averageRF);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
