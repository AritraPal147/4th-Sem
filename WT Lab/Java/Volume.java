// 2) Write a program in Java to create a class MyVolume with required data members 
// and find the volume of cube, cuboid and sphere using constructor overloading.

import java.lang.Math;

class MyVolume {
    private double vol;

    MyVolume(int side) {
        this.vol = Math.pow(side, 3);
    }

    MyVolume (double radius, int numOfSides) {
        if (numOfSides == 0) {
            this.vol = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
    }

    MyVolume (int len, int bre, int hei) {
        this.vol = len * bre * hei;
    }

    public double getVolume() {
        return vol;
    }
}

public class Volume {
    public static void main(String[] args) {
        MyVolume cube = new MyVolume(5);
        MyVolume sphere = new MyVolume(2.5, 0);
        MyVolume cuboid = new MyVolume(3, 4, 5);

        System.out.println("Volume of cube with side 5: " + cube.getVolume());
        System.out.println("Volume of cuboid with length 3, width 4, and height 5: " + cuboid.getVolume());
        System.out.println("Volume of sphere with radius 2.5: " + sphere.getVolume());
    }
}
