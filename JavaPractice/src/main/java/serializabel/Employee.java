package serializabel;

//CODE REFERENCE
//https://segmentfault.com/a/1190000039387740
//https://blog.csdn.net/chengyuqiang/article/details/54600499?utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-1.no_search_link&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7Edefault-1.no_search_link
//https://blog.csdn.net/u013985664/article/details/79170886

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
    public String name;
    public String address;
    public transient int SSN;
    public int ID;
    public void mailCheck(){
        System.out.println("Mailing a check to " + name + " " + address );
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(address);
        out.writeObject(ID);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        address = (String) in.readObject();
        ID =(int) in.readObject();
        //need to read variable in order
        //transient 修饰的variable cannot be deserializable

    }

}

