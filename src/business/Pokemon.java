package business;

import java.util.ArrayList;

public class Pokemon {
	public String name;
	public ArrayList<Move> moves;
	public ArrayList<Ability> abilities;
	public Item item;
	public String nature;
	public String type_1;
	public String type_2;
	
	public Pokemon(){
		moves = new ArrayList<>();
		abilities = new ArrayList<>();
		item = new Item();
	}
	
	public static String getModifiedPokemonName(String name){
		String mod = name.replace("-1", "").replace("-2", "").replace("-3", "").replace("-4", "");
		return mod.trim();
	}
}
