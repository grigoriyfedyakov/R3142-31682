import ru.ifmo.se.pokemon.*; 

public class Nuzzle extends PhysicalMove{
	 Nuzzle () {
		super(Type.ELECTRIC,20,100);
	}
	protected String describe() {
		return "nuzzled";
	}
	private final Effect bolt = new Effect().chance(1).condition(Status.PARALYZE);
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		p.addEffect(bolt);
		
}}