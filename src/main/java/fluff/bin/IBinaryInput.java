package fluff.bin;

import java.io.IOException;

/**
 * The {@code IBinaryInput} interface defines methods for reading various data types from a binary input.
 * Implementations of this interface can be used to deserialize binary data.
 */
public interface IBinaryInput {
	
    /**
     * Reads a boolean value from the binary input.
     *
     * @return the boolean value read
     * @throws IOException if an I/O error occurs
     */
    boolean Boolean() throws IOException;
    
    /**
     * Reads a byte value from the binary input.
     *
     * @return the byte value read
     * @throws IOException if an I/O error occurs
     */
    byte Byte() throws IOException;
    
    /**
     * Reads a char value from the binary input.
     *
     * @return the char value read
     * @throws IOException if an I/O error occurs
     */
    char Char() throws IOException;
    
    /**
     * Reads a short value from the binary input.
     *
     * @return the short value read
     * @throws IOException if an I/O error occurs
     */
    short Short() throws IOException;
    
    /**
     * Reads an int value from the binary input.
     *
     * @return the int value read
     * @throws IOException if an I/O error occurs
     */
    int Int() throws IOException;
    
    /**
     * Reads a float value from the binary input.
     *
     * @return the float value read
     * @throws IOException if an I/O error occurs
     */
    float Float() throws IOException;
    
    /**
     * Reads a long value from the binary input.
     *
     * @return the long value read
     * @throws IOException if an I/O error occurs
     */
    long Long() throws IOException;
    
    /**
     * Reads a double value from the binary input.
     *
     * @return the double value read
     * @throws IOException if an I/O error occurs
     */
    double Double() throws IOException;
    
    /**
     * Reads a length-prefixed string from the binary input.
     *
     * @return the string read
     * @throws IOException if an I/O error occurs
     */
    String LenString() throws IOException;
    
    /**
     * Reads a fixed-length string from the binary input.
     *
     * @param length the number of characters to read
     * @return the string read
     * @throws IOException if an I/O error occurs
     */
    String String(int length) throws IOException;
    
    /**
     * Reads a length-prefixed byte array from the binary input.
     *
     * @return the byte array read
     * @throws IOException if an I/O error occurs
     */
    byte[] LenBytes() throws IOException;
    
    /**
     * Reads a fixed-length byte array from the binary input.
     *
     * @param length the number of bytes to read
     * @return the byte array read
     * @throws IOException if an I/O error occurs
     */
    byte[] Bytes(int length) throws IOException;
    
    /**
     * Reads binary data into the specified {@code IBinaryData} object.
     *
     * @param data the {@code IBinaryData} object to read data into
     * @throws IOException if an I/O error occurs
     */
    void Data(IBinaryData data) throws IOException;
}
