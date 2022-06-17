package ZooKeeper1;

public class Mammal {
    int energyLevel = 100;

    public Mammal displayEnergy() {
        System.out.println("Energy level is: " + energyLevel);
        return this;
    }

}