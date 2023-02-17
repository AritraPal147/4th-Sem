// 4. Program to find no. of objects created out 
//    of a class using static modifier.

class ObjectGenerator {
	public static int count = 0;

	ObjectGenerator() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}
}

class Q4_Count_NumOfObjects {
	public static void main(String[] args) {
		ObjectGenerator obj1 = new ObjectGenerator();
		ObjectGenerator obj2 = new ObjectGenerator();
		ObjectGenerator obj3 = new ObjectGenerator();
		ObjectGenerator obj4 = new ObjectGenerator();
		
		System.out.println("Number of objects created: " + ObjectGenerator.getCount());
	}
}
