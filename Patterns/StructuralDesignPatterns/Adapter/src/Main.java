package StructuralDesignPatterns.Adapter.src;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        // The captain can only operate rowing boats but with adapter he is able to use fishing boats as well
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
