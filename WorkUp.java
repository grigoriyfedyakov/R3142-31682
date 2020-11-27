import ru.ifmo.se.pokemon.*; 

public class WorkUp extends StatusMove{
	 WorkUp () {
		super(Type.NORMAL,80,100);
	}
	protected String describe() {
		return "worked up";
	}
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.SPECIAL_ATTACK, +1);
		p.setMod(Stat.ATTACK, +1);
		
}}