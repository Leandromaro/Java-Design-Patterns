package BehavioralDesignPatterns.Mediator.src;

public class UserImpl extends User {

    // It wires a mediator by dependency injection
    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg){
        System.out.println(this.name+": Sending Message="+msg);
        // the user instead of sending the message individually uses the mediator
        // so it's loosely coupled to other users
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }
}
