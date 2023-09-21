
public class testBoxWithoutGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BoxWithoutGeneric boxWithoutGeneric = new BoxWithoutGeneric(15);
		System.out.println("Gia tri: "+boxWithoutGeneric.getValue());
		
//		BoxWithoutGeneric boxWithoutGeneric2 = new BoxWithoutGeneric("muoi lam"); => Sai
//		System.out.println("Gia tri: "+boxWithoutGeneric2.getValue());
		
//		BoxWithoutGeneric boxWithoutGeneric3 = new BoxWithoutGeneric(15.5); => Sai
//		System.out.println("Gia tri: "+boxWithoutGeneric3.getValue());
	}

}
