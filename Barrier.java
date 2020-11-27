import ru.ifmo.se.pokemon.*; 

public class Barrier extends StatusMove{
	 Barrier () {
		super(Type.PSYCHIC,0,0);
	}
	protected String describe() {
		return "defended";
	}
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.DEFENSE, 2);
		
}}