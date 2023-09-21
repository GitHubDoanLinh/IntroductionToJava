
public class testBoxGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box box1 = new Box<Integer>(15);
		System.out.println("Gia tri: "+box1.getValue());
		
		Box box2  = new Box<String>("Linh");
		System.out.println("Hello "+ box2.getValue());
		
		Box box3  = new Box<Double>(96.6);
		System.out.println("Giá trị "+ box3.getValue());
	}

}
