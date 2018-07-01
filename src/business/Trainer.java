package business;

import java.util.ArrayList;

public class Trainer {
	public String name;
	public ArrayList<Pokemon> pokemon;
	
	public Trainer(){
		this.pokemon = new ArrayList<>();
	}
	
	public void printSets(){
		System.out.println(name + ": " + pokemon.size() + " ----------------------");
		for(Pokemon p : pokemon){
			StringBuilder builder = new StringBuilder();
			builder.append(p.name + ": " + p.item.name + "\n");
			builder.append("Types: " + p.type_1);
			if(p.type_2 != null){
				builder.append(", " + p.type_2);
			}
			
			for(Ability a : p.abilities) {
				builder.append(a.type + ": " + a.name);
			}
			
			for(Move m : p.moves)
			{
				builder.append("\n\t" + m.name);
			}
			
			System.out.println(builder.toString());
		}
	}
}
