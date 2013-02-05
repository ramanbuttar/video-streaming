public class Test {

	public static void main(String[] args) {
		int Version = 2;
		int Padding = 0;
		int Extension = 0;
		int CC = 3;
		int Marker = 0;
		int Ssrc = 0;
		
		int SequenceNumber = 65532;
		int TimeStamp = 16777217;
		int PayloadType = 50;
		
		byte[] header = new byte[12];
		header[0] |= Version << (7-1);
		header[0] |= Padding << (7-3);
		header[0] |= Extension << (7-4);
		header[0] |= CC << (7-7);
		
		header[1] |= Marker << (7-0);
		header[1] |= PayloadType << (7-7);
		
		header[2] |= SequenceNumber >> 8;
		header[3] |= SequenceNumber & 0xFF;
		
		header[4] |= TimeStamp >> 24;
		header[5] |= TimeStamp >> 16;
		header[6] |= TimeStamp >> 8;
		header[7] |= TimeStamp & 0xFF;
		
		header[8] |= Ssrc >> 24;
		header[9] |= Ssrc >> 16;
		header[10] |= Ssrc >> 8;
		header[11] |= Ssrc & 0xFF;
		
		
		

		
		printheader(header);

	}
	
	public static void printheader(byte[] header) {
		//TO DO: uncomment
		
		 for (int i=0; i < (12-4); i++)
		 {
		 for (int j = 7; j>=0 ; j--)
		 if (((1<<j) & header[i] ) != 0)
		 System.out.print("1");
		 else
		 System.out.print("0");
		 System.out.print(" ");
		 }

		 System.out.println();
		 
	}

}
