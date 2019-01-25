package StructuralDesignPatterns.Adapter.src;

public class FishingBoatAdapter implements RowingBoat {

    private FishingBoat boat;

    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }
}
