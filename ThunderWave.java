import ru.ifmo.se.pokemon.*; 

public class ThunderWave extends StatusMove{
	 ThunderWave () {
		super(Type.ELECTRIC,0,90);
	}
	protected String describe() {
		return "paralyzed";
	}
	private final Effect bolt = new Effect().chance(1).condition(Status.PARALYZE);
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		p.addEffect(bolt);
		
}}