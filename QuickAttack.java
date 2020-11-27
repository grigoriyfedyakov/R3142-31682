import ru.ifmo.se.pokemon.*; 

public class QuickAttack extends PhysicalMove{
	 QuickAttack () {
		super(Type.NORMAL,40,100,1,0);
	}
	protected String describe() {
		return "quickly attacked";
	}
}