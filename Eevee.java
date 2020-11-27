import ru.ifmo.se.pokemon.*; 

public class Eevee extends Pokemon {
	Eevee(String name, int level){
		super(name,level);
		setType(Type.NORMAL);
		setStats(55,55,50,45,65,55);
		addMove(new WorkUp());
		addMove(new SandAttack());
		addMove(new QuickAttack());
}}