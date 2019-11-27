package com.company;

import com.company.JukeBox1.JukeBox;
import com.company.generics.Animals;
import com.company.generics.Cat;
import com.company.generics.Dog;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        JukeBox jukeBox =new JukeBox();
//        jukeBox.go();
//        TestTreeSet testTree = new TestTreeSet();
//        testTree.go();

//        HashMap<String,Integer> scores = new HashMap<String, Integer>();
//
//        scores.put("kathy", 42);
//        scores.put("Bert", 343);
//        scores.put("Skyler", 420);
//
//        System.out.println(scores);
//        System.out.println(scores.get("Bert"));
        /**
         * declaring array of animal object.
         */
      //  Animals[] animals = {new Dog(), new Cat(), new Dog()};

       // Animals animals[] = {new Dog()};
        /**
         * declaring array of Dog object.
         */
//        Dog[] dogs = {new Dog(), new Dog(), new Dog()};

        /**
         * calling takeAnimals() method with animals object as parameter
         */
//        takeAnimals(animals);

        /**
         * calling takeAnimals() method with dog object as parameter
         * since dog extends animal class so dog is also an animal.
         * the parameter is accepted
         */
//        takeAnimals(dogs);

        /**
         * what happens when we use generics like ArrayList ?
         */
          ArrayList<Animals> animals = new ArrayList<Animals>();
          animals.add(new Dog());
          animals.add(new Cat());
          animals.add(new Dog());

          takeAnimals(animals);

          ArrayList<Dog> dogs = new ArrayList<Dog>();
          dogs.add(new Dog());
          dogs.add(new Dog());
          dogs.add(new Dog());

        /**
         * now the takeAnimals() won't work even though the dog class extends from animal class
         * for array this works
         * for array list(collection types) it won't work
         * array types are checked again at run time but collection types are checked on compile time
         */
//          takeAnimals(dogs);
    }

    /**
     *
     * @param animals Animal class object or objects which are extending animal object
     */
//    public static void takeAnimals(Animals[] animals){
//        for(Animals a: animals){
//            a.eat();
//        }
//    }

    public static void takeAnimals(ArrayList<Animals> animals) {
        for(Animals a: animals) {
            a.eat();
        }
    }

}
