import ru.ifmo.se.pokemon.*; 

public class Glaceon extends Pokemon {
	Glaceon(String name, int level){
		super(name,level);
		setType(Type.ICE);
		setStats(65,60,110,130,95,65);
		addMove(new WorkUp());
		addMove(new SandAttack());
		addMove(new QuickAttack());
		addMove(new Barrier());
}}