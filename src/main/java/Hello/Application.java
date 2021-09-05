package Hello;

public class Application {
    public static void main(String[] args){
        System.out.println("application");
        MessagePrinter printer = new MessagePrinter();
        MessagesService service = new MessagesService();
        System.out.println("test");
        printer.setService(service);
        printer.printMessage();
    }
}
