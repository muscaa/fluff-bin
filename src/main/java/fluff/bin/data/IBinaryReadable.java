package fluff.bin.data;

import java.io.IOException;

import fluff.bin.IBinaryInput;

/**
 * The {@code IBinaryReadable} interface defines methods for reading from binary data streams.
 * Classes that implement this interface can be used to deserialize data in binary format.
 */
public interface IBinaryReadable {
	
    /**
     * Reads data from the specified binary input.
     *
     * @param in the binary input to read data from
     * @throws IOException if an I/O error occurs
     */
    void readData(IBinaryInput in) throws IOException;
}
