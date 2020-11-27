import ru.ifmo.se.pokemon.*; 

public class Thunderbolt extends SpecialMove{
	 Thunderbolt () {
		super(Type.ELECTRIC,90,100);
	}
	protected String describe() {
		return "strongly paralyzed";
	}
	private final Effect bolt = new Effect().chance(0.1).condition(Status.PARALYZE);
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		p.addEffect(bolt);
		
}}