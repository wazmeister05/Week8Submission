package Week5;

public class TestCylinder {

    public static void main(String[] args){

        //create the cylinder array and populate it before printing everything
        ManyCylinders mc = new ManyCylinders();
        mc.fillCylinderOfCylinders();

        long start = System.nanoTime();
        for(int i = 0; i < mc.cylinders.length; i++){
            System.out.println("\nCylinder " + (i+1) + ": " +
                    "Cylinder radius: " + mc.cylinders[i].getRadius() +
                    ". Cylinder height: " + mc.cylinders[i].getHeight() +
                    ". Cylinder area: " + mc.cylinders[i].getArea() +
                    ". Cylinder volume: " + mc.cylinders[i].getVolume() +
                    ". Cylinder colour: " + mc.cylinders[i].getColor());
        }
        long end = System.nanoTime();
        System.out.println("\n\nThis algorithm took " + (end - start) + " nanoseconds to generate " + mc.cylinders.length + " cylinders.");

    }
}
