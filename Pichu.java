import ru.ifmo.se.pokemon.*; 

public class Pichu extends Pokemon {
	Pichu(String name, int level){
		super(name,level);
		setType(Type.ELECTRIC);
		setStats(20,40,15,35,35,60);
		addMove(new ThunderWave());
		addMove(new Thunderbolt());
		
}}