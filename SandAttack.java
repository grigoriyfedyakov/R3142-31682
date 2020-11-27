import ru.ifmo.se.pokemon.*; 

public class SandAttack extends StatusMove{
	 SandAttack () {
		super(Type.GROUND,0,100);
	}
	protected String describe() {
		return "blinded his enemy by the lights";
	}
	protected void applyOppEffects(Pokemon p) {
		p.setMod(Stat.ACCURACY, -1);
		
}}