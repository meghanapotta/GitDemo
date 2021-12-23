package CoreJava;


public class ChildEmirites extends ParentAirCrsft {

	public static void main(String[] args) {
	
		ChildEmirites c = new ChildEmirites();
		c.engine();
		c.safetyGuideLines();
		c.bodyColor();
	}

	@Override
	public void bodyColor() {
		
		System.out.println("red color on the body");
	}

}
