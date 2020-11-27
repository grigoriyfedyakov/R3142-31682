import ru.ifmo.se.pokemon.*; 

public class RockPolish extends StatusMove{
	 RockPolish () {
		super(Type.ROCK,0,0);
	}
	protected String describe() {
		return "speeded up";
	}
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.SPEED, +2);
		
}}