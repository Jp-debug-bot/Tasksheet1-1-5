public class Main {
	public static void main(String[] args) {
		String a = new String("Wow");
        String b = "Wow";
        String c = a;
        String d = c;

boolean b1 = a != b;  // a == b would be false since 'a' and 'b' are different objects, so we need to change it to a != b
boolean b2 = d.equals(b);  // d.equals(b + "!") would be false, so we remove the "!" to make it true
boolean b3 = !c.equals(a + "!");  // c.equals(a) would be true, so adding a "!" makes it false, and the negation makes it true

if (b1 && b2 && b3) {
    System.out.println("Success!");
}

	}
}
