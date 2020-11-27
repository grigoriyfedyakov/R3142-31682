import ru.ifmo.se.pokemon.*; 


public class Main {
	public static void main(String[] args) {
		Battle b = new Battle();
		Pokemon misha = new Mew ("Misha",270);
		Pokemon igor = new Eevee ("Igor",65);
		Pokemon maxim = new Glaceon("Maxim",184);
		Pokemon sanya = new Pichu ("Sanya",41);
		Pokemon sasha = new Pikachu ("Sasha",112);
		Pokemon alexandr = new Raichu ("Alexandr",218);
		
		b.addAlly(misha);
		b.addFoe(sanya);
		b.addAlly(igor);
		b.addFoe(sasha);
		b.addAlly(maxim);
		b.addFoe(alexandr);
		b.go();
}}