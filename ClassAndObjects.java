package WeekDay1;

public class ClassAndObjects {
	
	String objectCategory = " Mobile Phone";
	float size; // declaration; initilization
	String shape;
	String IMEI;
	char brandName;
	int resolution;
	byte weight;
	boolean isTouchScreen;
	short costMobile;

	// Actions/methods
	
	
	public void makeCalls() {
		// local variables
		int numOfcalls = 10;
		System.out.println(" Making calls");
	}

	public void payMoney() {
		System.out.println("Paying money");
	}

	public void viewGallery() {
		System.out.println(" viwing gallery");
	}

	public static void main(String[] args) {
	
		ClassAndObjects samsung = new ClassAndObjects();
		samsung.brandName = 'S';
		samsung.costMobile = 30000;
		samsung.isTouchScreen = true;
		samsung.resolution = 324;
		samsung.IMEI = "3290492492539045";
		samsung.viewGallery();
		samsung.payMoney();
		samsung.makeCalls();
		System.out.println("samsung.brandName" + samsung.brandName);
		System.out.println("samsung.costMobile " + samsung.costMobile);
		System.out.println("************************");
		ClassAndObjects apple = new ClassAndObjects();
		apple.brandName = 'A';
		apple.costMobile = 23442;
		apple.isTouchScreen = false;
		apple.resolution = 323;
		apple.IMEI = "3290492492539045";
		apple.viewGallery();
		apple.payMoney();
		apple.makeCalls();
		System.out.println("apple.brandName" + apple.brandName);
		System.out.println("apple.costMobile " + apple.costMobile);
	}

}
