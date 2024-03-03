
public class TP2 {
	public static void main(String[] argv) throws Exception {
		Pile Pile1;
		Pile1 = new Pile();
		Pile1.push(8);
		Pile1.push(3);
		System.out.println(Pile1.pull());
		
		System.out.println(Pile1.pull());
		
	}
}