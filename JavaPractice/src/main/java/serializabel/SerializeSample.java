package serializabel;

import java.io.*;

public class SerializeSample {
    public static void main(String[] args){
        Employee e = new Employee();
        e.name = "xx";
        e.address = "Zetland";
        e.SSN = 11111;
        e.ID = 222;

        try{
            FileOutputStream fileOut = new FileOutputStream("object.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in obj.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
