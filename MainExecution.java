public class MainExecution {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		String codes[] = service.getEmployeeCodes();
		String pincodes[] = service.getEmployeePinCodes();
		for (String empid : codes) {
			System.out.println(empid);
		}
		for (String pin : pincodes) {
		    try{
    		    service.getPinCodeLocation(pin);
		    } catch(Exception e) {
		        System.out.println(e);
		    }
		}

	}//end main
}
