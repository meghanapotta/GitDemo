package CoreJava;

public class ChildClassDemo extends ParentClassdemo {

	public void breaks() {
		System.out.println("breaks implemented");
	}

	public void engine() {
		System.out.println("new engine");
	}

	public void color() {

		System.out.println(color);
	}

	public static void main(String[] args) {

		ChildClassDemo c = new ChildClassDemo();
		c.color();
		c.audiosystem();
		c.gear();
		c.breaks();

	}

}
