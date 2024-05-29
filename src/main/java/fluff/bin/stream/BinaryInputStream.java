package fluff.bin.stream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import fluff.bin.IBinaryData;
import fluff.bin.IBinaryInput;

public class BinaryInputStream extends FilterInputStream implements IBinaryInput {
	
	public BinaryInputStream(InputStream in) {
		super(in);
	}
	
	@Override
	public boolean Boolean() throws IOException {
		return read() != 0;
	}
	
	@Override
	public byte Byte() throws IOException {
		return (byte) read();
	}
	
	@Override
	public char Char() throws IOException {
		return (char) (
				(read() & 0xFF) <<  8 |
        		(read() & 0xFF)
                );
	}
	
	@Override
	public short Short() throws IOException {
		return (short) (
				(read() & 0xFF) <<  8 |
        		(read() & 0xFF)
                );
	}
	
	@Override
	public int Int() throws IOException {
		return (int) (
				(read() & 0xFF) << 24 |
				(read() & 0xFF) << 16 |
				(read() & 0xFF) <<  8 |
        		(read() & 0xFF)
                );
	}
	
	@Override
	public float Float() throws IOException {
		return Float.intBitsToFloat(Int());
	}
	
	@Override
	public long Long() throws IOException {
		return (long) (
				(read() & 0xFF) << 56 |
				(read() & 0xFF) << 48 |
				(read() & 0xFF) << 40 |
				(read() & 0xFF) << 32 |
				(read() & 0xFF) << 24 |
				(read() & 0xFF) << 16 |
				(read() & 0xFF) <<  8 |
        		(read() & 0xFF)
                );
	}
	
	@Override
	public double Double() throws IOException {
		return Double.longBitsToDouble(Long());
	}
	
	@Override
	public String LenString() throws IOException {
		return String(Int());
	}
	
	@Override
	public String String(int length) throws IOException {
		char[] chars = new char[length];
		for (int i = 0; i < length; i++) {
			chars[i] = Char();
		}
		return new String(chars);
	}
	
	@Override
	public byte[] LenBytes() throws IOException {
		return Bytes(Int());
	}
	
	@Override
	public byte[] Bytes(int length) throws IOException {
		byte[] bytes = new byte[length];
		read(bytes);
		return bytes;
	}
	
	@Override
	public void Data(IBinaryData data) throws IOException {
		data.readData(this);
	}
}
