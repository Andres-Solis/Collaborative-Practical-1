package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model, "controller 1", 40, 40); // Create first controller
        Controller2 c2 = new Controller2(model, "controller 2", 40, 200); // Create second controller
        Controller1 c3 = new Controller1(model, "controller 3", 40, 360); // Create third controller
        Controller2 c4 = new Controller2(model, "controller 4", 40, 520); // Create fourth controller
        
    } // main
  
} // Main
