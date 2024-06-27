package fluff.bin.stream;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import fluff.bin.Binary;
import fluff.bin.IBinaryOutput;
import fluff.bin.data.IBinaryWritable;

/**
 * The {@code BinaryOutputStream} class extends {@code FilterOutputStream} and implements the {@code IBinaryOutput} 
 * interface, providing methods to write various binary data types to an underlying output stream.
 */
public class BinaryOutputStream extends FilterOutputStream implements IBinaryOutput {
    
    /**
     * Constructs a new {@code BinaryOutputStream} with the specified output stream.
     *
     * @param out the underlying output stream
     */
    public BinaryOutputStream(OutputStream out) {
        super(out);
    }
    
    @Override
    public void Boolean(boolean value) throws IOException {
        Binary.Boolean(this::write, value);
    }
    
    @Override
    public void Byte(byte value) throws IOException {
    	Binary.Byte(this::write, value);
    }
    
    @Override
    public void Char(char value) throws IOException {
    	Binary.Char(this::write, value);
    }
    
    @Override
    public void Short(short value) throws IOException {
    	Binary.Short(this::write, value);
    }
    
    @Override
    public void Int(int value) throws IOException {
    	Binary.Int(this::write, value);
    }
    
    @Override
    public void Float(float value) throws IOException {
    	Binary.Float(this::write, value);
    }
    
    @Override
    public void Long(long value) throws IOException {
    	Binary.Long(this::write, value);
    }
    
    @Override
    public void Double(double value) throws IOException {
    	Binary.Double(this::write, value);
    }
    
    @Override
    public void LenString(String value) throws IOException {
    	Binary.LenString(this::write, value);
    }
    
    @Override
    public void String(String value, int length) throws IOException {
    	Binary.String(this::write, value, length);
    }
    
    @Override
    public void LenBytes(byte[] value) throws IOException {
    	Binary.LenBytes(this::write, value);
    }
    
    @Override
    public void Bytes(byte[] value, int length) throws IOException {
    	Binary.Bytes(this::write, value, length);
    }
    
    @Override
    public void Data(IBinaryWritable data) throws IOException {
        data.writeData(this);
    }
}
