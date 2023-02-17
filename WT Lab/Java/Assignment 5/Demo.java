// 7) Write a class file – box with three data members(length, width, height)
//	  and a method  volume()  .  Also  implement  the  application  class  Demo
//    where  an object of the box class is created with user entered dimensions
//	  and volume is printed.

import java.util.Scanner;

class Box {
	int length;
	int width;
	int height;
	
	Box(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	
	public int volume() {
		return length * width * height;
	}
}

class Demo{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length of box: ");
		int len = input.nextInt();
		
		System.out.print("Enter breadth of box: ");
		int bre = input.nextInt();
		
		System.out.print("Enter height of box: ");
		int hei = input.nextInt();
		
		Box box = new Box(len, bre, hei);
		int volume = box.volume();
		System.out.println("Volume of box: " + volume);
		input.close();
	}
}