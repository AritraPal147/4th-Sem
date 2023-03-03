// 1. Illustrate the execution of constructors in multi-level inheritance with
//    three Java classes – plate(length, width), box(length, width, height), 
//    wood box (length, width, height, thick)

class Plate {
	int length, breadth;
	Plate(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
}

class Box extends Plate {
	int height;
	Box(int length, int breadth, int height) {
		super(length, breadth);
		this.height = height;
	}
}

class WoodBox extends Box {
	int thick;
	WoodBox(int length, int breadth, int height, int thick) {
		super(length, breadth, height);
		this.thick = thick;
	}
	
	public void showDimensions() {
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
		System.out.println("Height: " + height);
		System.out.println("Thickness: " + thick);
	}
}

public class Q1_Constructor_Inheritance {
	public static void main(String[] args) {
		WoodBox woodBox = new WoodBox(1, 2, 3, 4);
		woodBox.showDimensions();
	}
}