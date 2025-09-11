package project;

//2)Objectinputstream and objectoutputstream
/*
 * Imagine you have a toy box full of different toys, and you want to send it to your friend who lives 
 * far away.

Problem:
You can't just send the toy box as it is, because it's too big and heavy to ship. 
Also, some toys might get broken or lost during shipping.

Solution:
You can take each toy apart, put it in a special box, and label it so your friend knows 
what it is and how to put it back together. This way, you can send the toys one by one, 
and your friend can easily assemble them.

Serializable:
In Java, Serializable is like a special label that you can put on an object (like a toy)
 so that it can be taken apart, sent somewhere else, and put back together again.

When you make an object Serializable, you're telling Java that it's okay to break it down into smaller 
pieces, convert it into a special format, and send it somewhere else. Then, when it arrives, 
Java can put it back together again, and it will be just like the original object.

Why is it useful?
Serializable is useful when you need to:

- Send objects over a network
- Save objects to a file
- Store objects in a database

It's like a special power that allows objects to travel safely and be
 reassembled when they arrive at their destination.
 */
import java.io.*;
class studentex implements Serializable
{
	String name;
	String regno;
	public studentex (String name,String regno)
	{
		this.name=name;
		this.regno=regno;
	}
}
public class FileDemoObjectIoStream {

	public static void main(String[] args) throws IOException,ClassNotFoundException
	{
		studentex s = new studentex("std1", "125");

        FileOutputStream fout = new FileOutputStream("E:\\obj.txt");
        ObjectOutputStream obout = new ObjectOutputStream(fout);
        obout.writeObject(s); // Write the object to the file
        obout.close();

        FileInputStream fin = new FileInputStream("E:\\obj.txt");
        ObjectInputStream obin = new ObjectInputStream(fin);
        studentex std = (studentex) obin.readObject(); // Read the object from the file
        System.out.println(std.name);
        System.out.println(std.regno);

	}

}
