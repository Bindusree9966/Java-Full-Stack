package SerializationDeserialization;

import java.io.*;

public class DES
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        String path="C:\\Users\\Admin\\IdeaProjects\\Java\\src\\SerializationDeserialization\\t1.txt";
        FileInputStream fis=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fis);
        SER s= (SER) ois.readObject();
        s.display();
        ois.close();
        fis.close();
    }
}
