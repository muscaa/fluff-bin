package fluff.bin.stream;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import fluff.bin.IBinaryData;
import fluff.bin.IBinaryOutput;

public class BinaryOutputStream extends FilterOutputStream implements IBinaryOutput {
	
	public BinaryOutputStream(OutputStream out) {
		super(out);
	}
	
	@Override
	public void Boolean(boolean value) throws IOException {
		write(value ? 1 : 0);
	}
	
	@Override
	public void Byte(byte value) throws IOException {
		write(value);
	}
	
	@Override
	public void Char(char value) throws IOException {
		write((value >>  8) & 0xFF);
		write((value      ) & 0XFF);
	}
	
	@Override
	public void Short(short value) throws IOException {
		write((value >>  8) & 0xFF);
		write((value      ) & 0XFF);
	}
	
	@Override
	public void Int(int value) throws IOException {
		write((value >> 24) & 0xFF);
		write((value >> 16) & 0xFF);
		write((value >>  8) & 0xFF);
		write((value      ) & 0XFF);
	}
	
	@Override
	public void Float(float value) throws IOException {
		Int(Float.floatToIntBits(value));
	}
	
	@Override
	public void Long(long value) throws IOException {
		write((int) ((value >> 56) & 0xFF));
		write((int) ((value >> 48) & 0xFF));
		write((int) ((value >> 40) & 0xFF));
		write((int) ((value >> 32) & 0xFF));
		write((int) ((value >> 24) & 0xFF));
		write((int) ((value >> 16) & 0xFF));
		write((int) ((value >>  8) & 0xFF));
		write((int) ((value      ) & 0XFF));
	}
	
	@Override
	public void Double(double value) throws IOException {
		Long(Double.doubleToLongBits(value));
	}
	
	@Override
	public void LenString(String value) throws IOException {
		Int(value.length());
		String(value, value.length());
	}
	
	@Override
	public void String(String value, int length) throws IOException {
		for (int i = 0; i < length; i++) {
			Char(value.charAt(i));
		}
	}
	
	@Override
	public void LenBytes(byte[] value) throws IOException {
		Int(value.length);
		Bytes(value, value.length);
	}
	
	@Override
	public void Bytes(byte[] value, int length) throws IOException {
		write(value, 0, length);
	}
	
	@Override
	public void Data(IBinaryData data) throws IOException {
		data.writeData(this);
	}
}
