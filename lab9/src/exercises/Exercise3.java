package exercises;
interface Validation{
	public boolean doValidation(String userName, String password);
}
public class Exercise3 {

	public static void main(String[] args) {
		Exercise3 obj = new Exercise3();
		obj.createValidation();

	}
	
	public void createValidation() {
		Validation v = (userName, password)-> userName.equals("Tripura")&&
				password.equals("T@1234");
		boolean res = v.doValidation("Tripura", "T@1234");
		System.out.println("validation is: "+res);
		
	}
}