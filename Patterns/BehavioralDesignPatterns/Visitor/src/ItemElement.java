package BehavioralDesignPatterns.Visitor.src;

public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}