package fluff.bin;

/**
 * The {@code IBinaryData} interface defines methods for reading from and writing to binary data streams.
 * Classes that implement this interface can be used to serialize and deserialize data in binary format.
 */
public interface IBinaryData {
	
    /**
     * Reads data from the specified binary input.
     *
     * @param in the binary input to read data from
     */
    void readData(IBinaryInput in);
    
    /**
     * Writes data to the specified binary output.
     *
     * @param out the binary output to write data to
     */
    void writeData(IBinaryOutput out);
}
