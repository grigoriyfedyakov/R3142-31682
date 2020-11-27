import ru.ifmo.se.pokemon.*; 

public class Pikachu extends Pichu {
	Pikachu(String name, int level){
		super(name,level);
		setStats(35,55,40,50,50,90);
		addMove(new Nuzzle());
		
}}