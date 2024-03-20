package CallExceptionMethods;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			throw new Exception("My Exception");
			} catch (Exception e) {
			System.err.println("Caught Exception");
			// show error information with e.getMessage()
			System.err.println("getLocalizedMessage():"
			+ e.getLocalizedMessage());
			// show stack trace of the error with e.printStackTrace();
	}
	}
}
