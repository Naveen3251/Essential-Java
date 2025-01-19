/*
 Inheritance  -- Specialization
specialization Means:
We have parent class from that we deriving child classes with extra functionality
 */
// Parent class
class Circle1 {
    private int radius;

    public Circle1(int r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

// Child class inheriting from Circle1
class Cylinder extends Circle1 {
    private int height;

    public Cylinder(int r, int h) {
        super(r); // Call to parent class constructor
        height = h;
    }

    public double volume() {
        return area() * height; // area() method from Circle1 is called here
    }
}

// Main class to test the functionality
class MyCircle {
    public static void main(String[] args) {
        // Create a Cylinder object with radius 9 and height 9
        Cylinder c1 = new Cylinder(9, 9);

        // Print the volume of the cylinder
        System.out.println(c1.volume());
    }
}
