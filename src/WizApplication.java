
public class WizApplication {
	public static void main(String[] args) {
		Wizard merlin = new Wizard("Merlin", 100);
		System.out.println(merlin.toString());
		merlin.takeDamage(25);
		System.out.println(merlin.toString());
		merlin.setName("Merlin the Enraged");
		System.out.println(merlin.toString());
		merlin.setKey(444);
		System.out.println(merlin.toString());
		merlin.lock(443);
		System.out.println(merlin.toString());
		merlin.lock(444);
		System.out.println(merlin.toString());
		merlin.takeDamage(33);
		System.out.println(merlin.toString());
		merlin.unlock(422);
		System.out.println(merlin.toString());
		merlin.unlock(444);
		System.out.println(merlin.toString());
		merlin.takeDamage(32);
		System.out.println(merlin.toString());
		merlin.setKey(333);
		merlin.setName("Merlin the Great");
		merlin.setHealth(500);
		System.out.println(merlin.toString());

	}//end main
}//end class
