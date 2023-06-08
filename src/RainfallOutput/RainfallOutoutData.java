package RainfallOutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class RainfallOutoutData {

public static void main(String[] args) {
		
		
		// 1. Declare output file 
		String outFile = "rainfallOutput.txt";
		
		// Data declaration
		String station = "Simpang Ampat";
		int rainfall[] = {0, 0, 4, 1, 0, 6};
		
		try {
			
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			// Process data
			dos.writeUTF(station);
			
			for (int index = 0; index < rainfall.length; index++) {
				
				// 3. Write data into data stream
				//dos.writeUTF(station);
				dos.writeInt(rainfall[index]);
				
				// 4. Flush for each writing
				//dos.flush();
			}
			
			dos.flush();
			
			// 5. Close stream
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}
}
