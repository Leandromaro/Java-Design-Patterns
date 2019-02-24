package Template.src;

public class BrickHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building brick Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with bricks and coating");
    }
}
