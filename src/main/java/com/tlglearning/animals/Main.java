package com.tlglearning.animals;

public class Main {

  public static void main(String[] args) {
   new Dog();
   /*
   0. Class initialization of Wolf superclass (Object) - not necessary, because Object is already loaded and initialized.
   1. Class initialization of wolf
   2. Class initialization of dog
   (2a). Object's initialization of Dog instance.
   3. Wolf's initialization of dog
   4. Dog's initialization of dog
    */
  }
}

