package fluff.bin;

import java.io.IOException;

public interface IBinaryInput {
	
	boolean Boolean() throws IOException;
	
	byte Byte() throws IOException;
	
	char Char() throws IOException;
	
	short Short() throws IOException;
	
	int Int() throws IOException;
	
	float Float() throws IOException;
	
	long Long() throws IOException;
	
	double Double() throws IOException;
	
	String LenString() throws IOException;
	
	String String(int length) throws IOException;
	
	byte[] LenBytes() throws IOException;
	
	byte[] Bytes(int length) throws IOException;
	
	void Data(IBinaryData data) throws IOException;
}
