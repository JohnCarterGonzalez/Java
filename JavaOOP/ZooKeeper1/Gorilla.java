package ZooKeeper1;

public class Gorilla extends Mammal {

    public void throwSomething() {
        energyLevel -= 5;
        System.out.println("Gorilla is throwing something");
    }

    public void eatBananas() {
        energyLevel += 10;
        System.out.println("Gorilla is eating bananas and is satisfied");
    }

    public void climb() {
        energyLevel -= 10;
        System.out.println("Gorilla is climbing");
    }
}
