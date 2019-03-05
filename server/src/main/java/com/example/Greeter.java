package com.example;


public class Greeter {

  
  public Greeter() {

  }
  
  /**
  * @param somene of a person
  * @return greeting string
  */

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}

