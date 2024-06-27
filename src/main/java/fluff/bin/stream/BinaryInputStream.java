package fluff.bin.stream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import fluff.bin.Binary;
import fluff.bin.IBinaryInput;
import fluff.bin.data.IBinaryReadable;

/**
 * The {@code BinaryInputStream} class extends {@code FilterInputStream} and implements the {@code IBinaryInput} 
 * interface, providing methods to read various binary data types from an underlying input stream.
 */
public class BinaryInputStream extends FilterInputStream implements IBinaryInput {
    
    /**
     * Constructs a new {@code BinaryInputStream} with the specified input stream.
     *
     * @param in the underlying input stream
     */
    public BinaryInputStream(InputStream in) {
        super(in);
    }
    
    @Override
    public boolean Boolean() throws IOException {
        return Binary.Boolean(this::read);
    }
    
    @Override
    public byte Byte() throws IOException {
        return Binary.Byte(this::read);
    }
    
    @Override
    public char Char() throws IOException {
        return Binary.Char(this::read);
    }
    
    @Override
    public short Short() throws IOException {
        return Binary.Short(this::read);
    }
    
    @Override
    public int Int() throws IOException {
        return Binary.Int(this::read);
    }
    
    @Override
    public float Float() throws IOException {
        return Binary.Float(this::read);
    }
    
    @Override
    public long Long() throws IOException {
        return Binary.Long(this::read);
    }
    
    @Override
    public double Double() throws IOException {
        return Binary.Double(this::read);
    }
    
    @Override
    public String LenString() throws IOException {
        return Binary.LenString(this::read);
    }
    
    @Override
    public String String(int length) throws IOException {
        return Binary.String(this::read, length);
    }
    
    @Override
    public byte[] LenBytes() throws IOException {
        return Binary.LenBytes(this::read);
    }
    
    @Override
    public byte[] Bytes(int length) throws IOException {
        return Binary.Bytes(this::read, length);
    }
    
    @Override
    public <V extends IBinaryReadable> V Data(V data) throws IOException {
        data.readData(this);
        return data;
    }
}
