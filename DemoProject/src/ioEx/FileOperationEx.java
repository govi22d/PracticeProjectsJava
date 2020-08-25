package ioEx;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class FileOperationEx {

	public static void main(String[] args) throws IOException {
		
		FileChannel fc = FileChannel.open(Paths.get("test.txt"), 
				StandardOpenOption.WRITE,StandardOpenOption.APPEND);
		
		//fc.position(fc.size() - 1);
		//lock file
		fc.lock();
		fc.write(ByteBuffer.wrap("str data".getBytes()));
		fc.close();
	}
}

