import Mammal.Mammal;

public class GiantBat {
    Mammal mammal = new Mammal();
    public Bat(){
        super(300);
    }

    public void fly() {
        mammal.energyLevel -= 50;
        System.out.println("Flllrrrttt Flllrrtt");
    }

    public void eatHumans(){
        mammal.energyLevel += 25;
    }

    public void attackTown(){
        mammal.energyLevel -= 100;
        System.out.println("*Sound of a town on fire*");
    }

}
