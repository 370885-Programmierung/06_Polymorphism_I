package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
      HoneyBee queen = new Queen();
      HoneyBee drone = new Drone();
      HoneyBee worker = new Worker();

      output(queen.doYourJob());
      output(drone.doYourJob());
      output(worker.doYourJob());

      HoneyBee bee = new HoneyBee();
      output(bee.doYourJob());

      output(queen.fly());
      output(drone.fly());
      output(worker.fly());
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

