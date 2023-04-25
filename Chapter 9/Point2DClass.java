/*
In this example, we first import the Point2D class from the java.awt.geom package.

We then create two Point2D objects called point1 and point2 using the Double constructor. We pass in the x and y coordinates of each point as arguments to the constructor.

We then use the distance method of the Point2D class to calculate the Euclidean distance between the two points. This method takes another Point2D object as an argument, and returns the distance between the two points.

Finally, we output the distance between the two points to the console using the println method.

When you run this code, it should output the following:

Distance between point1 and point2: 2.8284271247461903
*/

import java.awt.geom.Point2D;

public class Example {
    public static void main(String[] args) {
        // Creating two Point2D objects
        Point2D point1 = new Point2D.Double(1.0, 2.0);
        Point2D point2 = new Point2D.Double(3.0, 4.0);

        // Calculating the distance between the two points
        double distance = point1.distance(point2);

        // Outputting the distance to the console
        System.out.println("Distance between point1 and point2: " + distance);
    }
}
