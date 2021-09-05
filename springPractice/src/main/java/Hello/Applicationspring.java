package Hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Applicationspring {
    public static void main(String[] args){
        System.out.println("applicationspring");
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }


}
