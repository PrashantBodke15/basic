package demo;

public class methods {

	void Employeelogin() {
		System.out.println("employee is logged in");
	}

	void userDashboard() {
		System.out.println("this is user DAshboard");

	}

	int sessionTime() {
		return 9;

	}

	void userAuthenticated(String username, String password) {
		System.out.println("it is a "+username);

	}

	public static void main(String args[]) {

		methods M = new methods();
		M.Employeelogin();
		M.userDashboard();
		int Time = M.sessionTime();
		System.out.println("Session Time" + Time);

		M.userAuthenticated("Prashant", "1518");
	}

}
