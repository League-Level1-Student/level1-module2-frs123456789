
public class TeaRunner {
public static void main(String[] args) {
	
	Cup tee = new Cup();
	Kettle k = new Kettle();
	TeaBag tb = new TeaBag("green");
	k.boil();
	tee.makeTea(tb, k.getWater());
	
	
	
}
}
