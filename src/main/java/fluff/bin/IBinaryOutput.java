package fluff.bin;

import java.io.IOException;

import fluff.bin.data.IBinaryWritable;

/**
 * The {@code IBinaryOutput} interface defines methods for writing various data types to a binary output.
 * Implementations of this interface can be used to serialize binary data.
 */
public interface IBinaryOutput {
	
    /**
     * Writes a boolean value to the binary output.
     *
     * @param value the boolean value to write
     * @throws IOException if an I/O error occurs
     */
    void Boolean(boolean value) throws IOException;
    
    /**
     * Writes a byte value to the binary output.
     *
     * @param value the byte value to write
     * @throws IOException if an I/O error occurs
     */
    void Byte(byte value) throws IOException;
    
    /**
     * Writes a char value to the binary output.
     *
     * @param value the char value to write
     * @throws IOException if an I/O error occurs
     */
    void Char(char value) throws IOException;
    
    /**
     * Writes a short value to the binary output.
     *
     * @param value the short value to write
     * @throws IOException if an I/O error occurs
     */
    void Short(short value) throws IOException;
    
    /**
     * Writes an int value to the binary output.
     *
     * @param value the int value to write
     * @throws IOException if an I/O error occurs
     */
    void Int(int value) throws IOException;
    
    /**
     * Writes a float value to the binary output.
     *
     * @param value the float value to write
     * @throws IOException if an I/O error occurs
     */
    void Float(float value) throws IOException;
    
    /**
     * Writes a long value to the binary output.
     *
     * @param value the long value to write
     * @throws IOException if an I/O error occurs
     */
    void Long(long value) throws IOException;
    
    /**
     * Writes a double value to the binary output.
     *
     * @param value the double value to write
     * @throws IOException if an I/O error occurs
     */
    void Double(double value) throws IOException;
    
    /**
     * Writes a length-prefixed string to the binary output.
     *
     * @param value the string to write
     * @throws IOException if an I/O error occurs
     */
    void LenString(String value) throws IOException;
    
    /**
     * Writes a fixed-length string to the binary output.
     *
     * @param value  the string to write
     * @param length the number of characters to write
     * @throws IOException if an I/O error occurs
     */
    void String(String value, int length) throws IOException;
    
    /**
     * Writes a length-prefixed byte array to the binary output.
     *
     * @param value the byte array to write
     * @throws IOException if an I/O error occurs
     */
    void LenBytes(byte[] value) throws IOException;
    
    /**
     * Writes a fixed-length byte array to the binary output.
     *
     * @param value  the byte array to write
     * @param length the number of bytes to write
     * @throws IOException if an I/O error occurs
     */
    void Bytes(byte[] value, int length) throws IOException;
    
    /**
     * Writes binary data from the specified {@code IBinaryWritable} object to the binary output.
     *
     * @param data the {@code IBinaryWritable} object containing data to write
     * @throws IOException if an I/O error occurs
     */
    void Data(IBinaryWritable data) throws IOException;
}
