package Week5;

import java.util.Scanner;

public class ManyCylinders extends Cylinder{

    Cylinder[] cylinders;
    private Scanner scanner;

    //initialise scanner
    public ManyCylinders(){
        scanner = new Scanner(System.in);
    }

    public void fillCylinderOfCylinders() {
        System.out.print("Please enter number of cylinders: ");
        int noOfCylinders = scanner.nextInt();
        cylinders = new Cylinder[noOfCylinders];
        //haven't added any sort of exception handling because that wasn't required.
        //user will select D or C to determine which path to take
        for (int i = 0; i < noOfCylinders; i++) {
            cylinders[i] = new Cylinder(rng(), rng());
        }
    }

    //generates the random numbers between 0 and 100 used for height and radius.
    public double rng(){
        double random = Math.random();
        random = random * 100;
        System.out.println(random);
        return random;
    }


}
