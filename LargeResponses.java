import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LargeResponses {

	public static void main(String[] args) {
		int count = 0;
		int sumOfBytes = 0;
		String fileName = "LargeResponse.txt";
		String inputFilePath = "C:\\Users\\RaneAnkit\\Downloads\\BankRecordGeneration\\BankRecordGeneration\\";
		String outputFilePath = "bytes_"+fileName;
		
		List<String> listOfRecords = readData(inputFilePath+fileName);
		
		for (String str : listOfRecords) {
			String[] strArray = str.split("\\s+(?![^\\[]*\\])") ;
			 if (strArray.length > 7) {
				 int bytes = Integer.parseInt(strArray[7]);
				 if (bytes > 5000) {
					 count++;
					 sumOfBytes+= bytes;
				 }
			 }
		}
		
		try {
			File file = new File(outputFilePath);
			file.createNewFile();
			PrintWriter pw = new PrintWriter(file);
			pw.println(count);
			pw.println(sumOfBytes);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<String> readData(String path) {
		List<String> outputList = new ArrayList<String>();
		try {
			FileReader fr =new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line; 
			while ((line = br.readLine()) != null) {
				outputList.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return outputList;
	}
}
