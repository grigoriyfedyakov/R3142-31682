import ru.ifmo.se.pokemon.*; 

public class DoubleTeam extends StatusMove{
	 DoubleTeam () {
		super(Type.NORMAL,0,0);
	}
	protected String describe() {
		return "moved";
	}
	
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.EVASION, +1);
		
}}