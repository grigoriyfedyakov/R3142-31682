import ru.ifmo.se.pokemon.*; 

public class Raichu extends Pikachu {
	Raichu(String name, int level){
		super(name,level);
		setStats(50,90,55,90,80,110);
		addMove(new DoubleTeam());
}}