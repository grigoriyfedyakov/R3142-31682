import ru.ifmo.se.pokemon.*; 

public class Mew extends Pokemon {
	Mew(String name, int level){
		super(name,level);
		setType(Type.ELECTRIC);
		setStats(100,100,100,100,100,100);
		addMove(new Scald());
		addMove(new DoubleTeam());
		addMove(new Amnesia());
		addMove(new RockPolish());
}}