package String.java;

public class RemoveSpecialCharacterExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This#string%contains^special*characters&.";
		
		str=str.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(str);
	}

}
