package project;


/*Here's an easy explanation:

bo.write(ob); means:

*Write the data in ob to the file using bo.*

Here's a simple analogy:

- ob is like a package with some stuff inside (the byte array representation of the string "Hello").
- bo is like a delivery truck (the BufferedOutputStream object) that takes the package to its 
destination (the file "FIO.txt").
- write() is like the action of putting the package on the truck.

So, when you call bo.write(ob), you're essentially saying:

"Take the package (ob) and deliver it to the file (FIO.txt) using the delivery truck (bo)!"*/

import java.io.*;
public class FileBufferedIo {

	public static void main(String[] args)throws IOException 
	{
		// Writing to a file
        FileOutputStream fo = new FileOutputStream("E:\\FIO.txt");
        BufferedOutputStream bo = new BufferedOutputStream(fo);
        String s = "Hello";
        byte[] ob = s.getBytes();
        bo.write(ob);
        bo.flush();
        bo.close();

        // Reading from a file
        FileInputStream fi = new FileInputStream("E:\\FIO.txt");
        BufferedInputStream bi = new BufferedInputStream(fi);
        int byteRead;
        while ((byteRead = bi.read()) != -1) {
            System.out.print((char) byteRead);//not written ln in print
        }
        bi.close();
	}

}
