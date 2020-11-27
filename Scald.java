import ru.ifmo.se.pokemon.*; 

public class Scald extends SpecialMove{
	 Scald () {
		super(Type.WATER,80,100);
	}
	protected String describe() {
		return "scalded";
	}
	private final Effect burn = new Effect().chance(0.3).condition(Status.BURN);
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		p.addEffect(burn);
		
}}