package fluff.bin;

import java.io.IOException;

public interface IBinaryOutput {
	
	void Boolean(boolean value) throws IOException;
	
	void Byte(byte value) throws IOException;
	
	void Char(char value) throws IOException;
	
	void Short(short value) throws IOException;
	
	void Int(int value) throws IOException;
	
	void Float(float value) throws IOException;
	
	void Long(long value) throws IOException;
	
	void Double(double value) throws IOException;
	
	void LenString(String value) throws IOException;
	
	void String(String value, int length) throws IOException;
	
	void LenBytes(byte[] value) throws IOException;
	
	void Bytes(byte[] value, int length) throws IOException;
	
	void Data(IBinaryData data) throws IOException;
}
