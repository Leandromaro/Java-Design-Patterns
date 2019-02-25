package BehavioralDesignPatterns.ChainOfResponsibility.src;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
