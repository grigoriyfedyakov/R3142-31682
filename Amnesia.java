import ru.ifmo.se.pokemon.*; 

public class Amnesia extends StatusMove{
	 Amnesia () {
		super(Type.PSYCHIC,0,0);
	}
	protected String describe() {
		return "remembered";
	}
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.DEFENSE, +2);
		
}}