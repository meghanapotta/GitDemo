package CoreJava;
import demopack.CentralTraffic;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		
		CentralTraffic a = new AustralianTraffic();
		a.RedStop();
		a.FlashYellow();
		a.GreenGo();
		
		AustralianTraffic a1 = new AustralianTraffic();
		a1.walkOnSymbol();
		
		ContinentalTraffic c = new AustralianTraffic();
		c.trainSymbol();

	}

	@Override
	public void GreenGo() {
		
		System.out.println("GreenGo implementation");
	}

	@Override
	public void RedStop() {
		
		System.out.println("ResdStop implementation");
	}

	public void walkOnSymbol() {
		
		System.out.println("walking");
	}
	
	@Override
	public void FlashYellow() {
		
		System.out.println("FlashYellow implementation");
	}

	@Override
	public void trainSymbol() {
		
		System.out.println("trainSymbol implementation");
	}

}
