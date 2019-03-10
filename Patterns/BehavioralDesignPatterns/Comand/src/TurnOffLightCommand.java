package BehavioralDesignPatterns.Comand.src;

public class TurnOffLightCommand implements Command{
    private Light theLight;
    public TurnOffLightCommand(Light light){
        this.theLight=light;
    }
    public void execute(){
        theLight.turnOff();
    }
}