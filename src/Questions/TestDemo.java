package Questions;

public class TestDemo {

	public static void main(String[] args) {
	
		TestClass tc = new TestClass();
		tc.setA(4);
		tc.setB(7);
		System.out.println(tc.getA()+" "+ tc.getB());
		
		TestClass tc2 = new TestClass(2,7);
		
		System.out.println(tc2.getB()+" "+tc2.getA());
		TestClass tc3  = new TestClass();
		
		TestClass tc4 = new TestClass(6);
		
		System.out.println(tc4.getA()+" "+tc4.getB());
		
		
		
		
		
		

	}

}
