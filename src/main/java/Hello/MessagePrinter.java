package Hello;

public class MessagePrinter {
    public MessagePrinter(){
        super();
        System.out.println("MessagePinter..");
    }

    private MessagesService service;

    public void setService(MessagesService service){
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }

}
