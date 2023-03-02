/* 
6) A plastic manufacturer sells plastic in different shapes like 2D sheet
and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of
box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost
of plastic as per the dimensions given by the user where 3D inherits from 2D.
*/

import java.util.Scanner;

class Shape2D {
    double area;

    Shape2D (double len, double bre) {
        this.area = len * bre;
    }

    double getCost() {
        return area * 40;
    }
}

class Shape3D extends Shape2D {
    double height;

    Shape3D(double len, double bre, double height) {
        super(len, bre);
        this.height = height;
    }

    double getCost() {
        return this.area * this.height * 60;
    }
}

public class Q6_VolumeInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of 2D shape: ");
        double len = scanner.nextDouble();
        System.out.print("Enter breadth of 2D shape: ");
        double bre = scanner.nextDouble();

        Shape2D shape1 = new Shape2D(len, bre);
        double cost2D = shape1.getCost();
        System.out.println("Cost of the 2D shape: Rs. " + cost2D);
        System.out.println();

        System.out.print("Enter lenth of 3D shape: ");
        len = scanner.nextDouble();
        System.out.print("Enter breadth of 3D shape: ");
        bre = scanner.nextDouble();
        System.out.print("Enter height of the 3D shape: ");
        double height = scanner.nextDouble();

        Shape3D shape2 = new Shape3D(len, bre, height);
        double cost3D = shape2.getCost();
        System.out.println("Cost of the 3D shape: Rs. " + cost3D);

        scanner.close();
    }
}
