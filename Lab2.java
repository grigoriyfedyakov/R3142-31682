
import ru.ifmo.se.pokemon.*; 


public class Lab2 {
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

class Mew extends Pokemon {
	Mew(String name, int level){
		super(name,level);
		setType(Type.ELECTRIC);
		setStats(100,100,100,100,100,100);
		addMove(new Scald());
		addMove(new DoubleTeam());
		addMove(new Amnesia());
		addMove(new RockPolish());
}}

class Eevee extends Pokemon {
	Eevee(String name, int level){
		super(name,level);
		setType(Type.NORMAL);
		setStats(55,55,50,45,65,55);
		addMove(new WorkUp());
		addMove(new SandAttack());
		addMove(new QuickAttack());
}}
class Glaceon extends Pokemon {
	Glaceon(String name, int level){
		super(name,level);
		setType(Type.ICE);
		setStats(65,60,110,130,95,65);
		addMove(new WorkUp());
		addMove(new SandAttack());
		addMove(new QuickAttack());
		addMove(new Barrier());
}}
class Pichu extends Pokemon {
	Pichu(String name, int level){
		super(name,level);
		setType(Type.ELECTRIC);
		setStats(20,40,15,35,35,60);
		addMove(new ThunderWave());
		addMove(new Thunderbolt());
		
}}
class Pikachu extends Pichu {
	Pikachu(String name, int level){
		super(name,level);
		setStats(35,55,40,50,50,90);
		addMove(new Nuzzle());
		
}}
class Raichu extends Pikachu {
	Raichu(String name, int level){
		super(name,level);
		setStats(50,90,55,90,80,110);
		addMove(new DoubleTeam());
}}





class Scald extends SpecialMove{
	 Scald () {
		super(Type.WATER,80,100);
	}
	protected String describe() {
		return "scalded";
	}
	private final Effect burn = new Effect().chance(0.3).condition(Status.BURN);
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		p.addEffect(burn);
		
}}

class DoubleTeam extends StatusMove{
	 DoubleTeam () {
		super(Type.NORMAL,0,0);
	}
	protected String describe() {
		return "moved";
	}
	
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.EVASION, +1);
		
}}

class Amnesia extends StatusMove{
	 Amnesia () {
		super(Type.PSYCHIC,0,0);
	}
	protected String describe() {
		return "remembered";
	}
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.DEFENSE, +2);
		
}}

class RockPolish extends StatusMove{
	 RockPolish () {
		super(Type.ROCK,0,0);
	}
	protected String describe() {
		return "speeded up";
	}
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.SPEED, +2);
		
}}

class WorkUp extends StatusMove{
	 WorkUp () {
		super(Type.NORMAL,80,100);
	}
	protected String describe() {
		return "worked up";
	}
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.SPECIAL_ATTACK, +1);
		p.setMod(Stat.ATTACK, +1);
		
}}

class SandAttack extends StatusMove{
	 SandAttack () {
		super(Type.GROUND,0,100);
	}
	protected String describe() {
		return "blinded his enemy by the lights";
	}
	protected void applyOppEffects(Pokemon p) {
		p.setMod(Stat.ACCURACY, -1);
		
}}

class QuickAttack extends PhysicalMove{
	 QuickAttack () {
		super(Type.NORMAL,40,100,1,0);
	}
	protected String describe() {
		return "quickly attacked";
	}
}

class Barrier extends StatusMove{
	 Barrier () {
		super(Type.PSYCHIC,0,0);
	}
	protected String describe() {
		return "defended";
	}
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.DEFENSE, 2);
		
}}

class ThunderWave extends StatusMove{
	 ThunderWave () {
		super(Type.ELECTRIC,0,90);
	}
	protected String describe() {
		return "paralyzed";
	}
	private final Effect bolt = new Effect().chance(1).condition(Status.PARALYZE);
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		p.addEffect(bolt);
		
}}

class Thunderbolt extends SpecialMove{
	 Thunderbolt () {
		super(Type.ELECTRIC,90,100);
	}
	protected String describe() {
		return "strongly paralyzed";
	}
	private final Effect bolt = new Effect().chance(0.1).condition(Status.PARALYZE);
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		p.addEffect(bolt);
		
}}

class Nuzzle extends PhysicalMove{
	 Nuzzle () {
		super(Type.ELECTRIC,20,100);
	}
	protected String describe() {
		return "nuzzled";
	}
	private final Effect bolt = new Effect().chance(1).condition(Status.PARALYZE);
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		p.addEffect(bolt);
		
}}