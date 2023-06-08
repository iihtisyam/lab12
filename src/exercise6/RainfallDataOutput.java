package exercise6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class RainfallDataOutput {
	
public static void main(String[] args) {
		
		
		// 1. Declare output file 
		String outFile = "rainfallOutputData.txt";
		
		// Data declaration
		String SNDR[][]= {{"Simpang Ampat", "2421003", "Alor Gajah", "0", "4", "1", "0", "6", "19"},
		{"Melaka Pindah", "2322006", "Alor Gajah", "0", "0", "0", "0", "2", "18"},
		{"Hospital Jasin", "2324033", "Jasin", "0", "0", "14", "0", "11", "15"},
		{"Chohong", "2225044", "Jasin", "0", "0", "21", "0", "39", "14"},
		{"Sg. Duyong", "2223023", "Melaka Tengah", "0", "0", "3", "0", "43", "26"},
		{"Klebang Besar D/S", "2222005", "Melaka Tengah", "0", "0", "14", "0", "75", "25"}
		};
		
		try
		{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			// 3. Write data into data stream
			
		
			for (String[] dsr : SNDR)
			{
				String district = dsr[0];
				String code = dsr[1];
				String station = dsr[2];
				String rainfall[] = {dsr[3],dsr[4],dsr[5],dsr[6],dsr[7],dsr[8]};
	
				dos.writeUTF(district);
				dos.writeUTF(code);
				dos.writeUTF(station);
				
				for (String RainFall : rainfall)
				{
					dos.writeInt(Integer.parseInt(RainFall));
				}
			}
			
				
			// 4. Flush for each writing
			dos.flush();
			
			
			// 5. Close stream
			dos.close();
			
			System.out.println("Rainfall data has been written to the file: " + outFile);
			
		}catch (Exception ex){
			ex.printStackTrace();
		}
			
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}

}
