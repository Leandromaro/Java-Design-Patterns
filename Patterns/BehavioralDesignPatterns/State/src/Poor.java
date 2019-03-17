package BehavioralDesignPatterns.State.src;

public class Poor implements State{
    @Override
    public void saySomething(StateContext sc) {
        System.out.println("I'm poor currently, and spend much time working.");
        sc.changeState(new Rich());
    }
}
