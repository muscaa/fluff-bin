package fluff.bin.data;

import java.io.IOException;

import fluff.bin.IBinaryOutput;

/**
 * The {@code IBinaryWritable} interface defines methods for writing to binary data streams.
 * Classes that implement this interface can be used to serialize data in binary format.
 */
public interface IBinaryWritable {
	
    /**
     * Writes data to the specified binary output.
     *
     * @param out the binary output to write data to
     * @throws IOException if an I/O error occurs
     */
    void writeData(IBinaryOutput out) throws IOException;
}
