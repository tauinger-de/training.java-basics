package de.auinger.training.java_basics.hierarchy2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<Reptile> ourReptiles;
    private final List<Carnivore> ourCarnivores;
    private final List<Flying> ourFlyingAnimals;

    public Zoo() {
        Crocodile crocodileJohnny = new Crocodile();
        FlyingSnake flyingSnakeJim = new FlyingSnake();

        ourReptiles = new ArrayList<>();
        ourReptiles.add(crocodileJohnny);
        ourReptiles.add(flyingSnakeJim);

        ourCarnivores = new ArrayList<>();
        ourCarnivores.add(Carnivore.createCarnivore(true, false));
        ourCarnivores.add(Carnivore.createCarnivore(false, true));
        ourCarnivores.add(Carnivore.createCarnivore(false, false));

        ourFlyingAnimals = new ArrayList<>();
        ourFlyingAnimals.add(Flying.createFlying(true));
        ourFlyingAnimals.add(Flying.createFlying(false));
    }

    public void introduceAnimals() {
        System.out.println("\nOUR REPTILES:");
        for (Reptile reptile : this.ourReptiles) {
            System.out.println("- " + reptile.toString());
        }

        System.out.println("\nOUR CARNIVORES:");
        for (Carnivore carnivore : this.ourCarnivores) {
            System.out.println("- " + carnivore.toString());
        }

        System.out.println("\nOUR FLYING ANIMALS:");
        for (Flying flying : this.ourFlyingAnimals) {
            System.out.println("- " + flying.toString());
        }
    }

    public static void main(String[] args) {
        new Zoo().introduceAnimals();
    }

}
