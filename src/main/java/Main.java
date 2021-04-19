package com.tts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================Pet Class==================");

        Pet pet1 = new Pet();

        System.out.println("What is your pet's name?");
        String petName = scanner.next();

        System.out.println("What is your pet's age?");
        int petAge = scanner.nextInt();

        System.out.println("Where do you all live?");
        String petLocation  = scanner.next();

        pet1.setName(petName);
        pet1.setAge(petAge);
        pet1.setLocation(petLocation);

        System.out.println("My pet cat's name is " +  pet1.getName() +  ", is " + pet1.getAge() + " years old, and we live in " + pet1.getLocation() + ".");


        System.out.println("=====================Custom Class==================");

        // instantiating and using a car object
        Car car1 = new Car();

        System.out.println("What model is your car?");
        String carModel = scanner.next();

        System.out.println("What year is your car?");
        int carYear = scanner.nextInt();

        System.out.println("What color is your car?");
        String carColor = scanner.next();

        car1.setModel(carModel);
        car1.setYearMake(carYear);
        car1.setColor(carColor);

        System.out.println("I have a " + car1.getColor() + " " + car1.getYearMake() + " " + car1.getModel() + ".");
    }
}
© 2021 GitHub, Inc.