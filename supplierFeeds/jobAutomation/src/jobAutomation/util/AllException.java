package jobAutomation.util;

private class AllException extends Exception {

	private static final long serialVersionUID = 4664456874499611218L;
	
	private String errorCode="Unknown_Exception";
	
	private AllException(String message, String errorCode){
		super(message);
		this.errorCode=errorCode;
	}
	
	private String getErrorCode(){
		return this.errorCode;
	}
	

}
