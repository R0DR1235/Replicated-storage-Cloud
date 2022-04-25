import java.io.IOException;
import java.io.BufferedReader;

public class StorageNode {
	
	public static final int MIN_NUMBER_ANSWER_TO_CORRECT = 2;
	public static final int STORED_DATA_LENGTH = 1000000;
	public static final int INITIAL_DOWNLOAD_BLOCK_LENGTH = 10000;
	
	public class DataMaintenanceThread extends Thread{
		private int index;
		
		public DataMaintenanceThread(int i) {
			index=i;
		}
		
		public void run() {
			while(true) {
				if(storedData[index]==null)
					System.err.println("Null at index:"+index);
				if(!storedData[index].isParityOk())
					try {
						System.err.println("Data Maintenance: Error was detected at "+index+":"+storedData[index]);
						getCorrectedByteFromOtherNodes(index);
					}catch(IOException e) {
						e.printStackTrace();
					}
				if(index==STORED_DATA_LENGTH-1) {
					index=0;
					System.err.println("Starting error detection from zero...");
				}else {
					index++;
					try {
						sleep(1);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	
	

}
