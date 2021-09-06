package serializabel;

import java.io.*;

public class Deserializable {
    public static void main(String args[]){
        Employee e = null;
        try{
            FileInputStream fileIn = new FileInputStream("object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee)in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        System.out.println("Deserialized Employee");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSH: " + e.SSN);
        System.out.println("ID: " + e.ID);

    }

}
